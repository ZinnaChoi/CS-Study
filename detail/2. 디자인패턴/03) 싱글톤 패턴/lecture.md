# 싱글톤 패턴 (Singleton)

> 하나의 클래스에 오직 하나의 인스턴스만 가지는 패턴

- 하나의 클래스를 기반으로 여러 개의 개별적인 인스턴스를 만들 수 있지만, 그렇게 하지 않고 하나의 클래스를 기반으로 단 하나의 인스턴스를 만들어 이를 기반으로 로직을 만드는데 사용된다
- 인스턴스 생성에 많은 코스트가 드는 데이터베이스 연결 모듈에 많이 쓰인다

### 1. 싱글통 패턴의 장점

- 하나의 인스턴스를 기반으로 해당 인스턴스를 다른 모듈들이 공유하여 사용하기 때문에 인스턴스를 생성할 때 드는 비용이 줄어든다.
- "인스턴스 생성에 많은 비용이 드는" **I/O 바운드** 작업에 많이 사용
  - I/O 바운드: 디스크 연결, 네트워크 통신(API 요청), 데이터베이스 연결
  - 보통 서버와 db는 서로 다른 컨테이너에서 분리되어 구축. server에서 db에 connect 후 query 보내는 과정에서 connect를 매번 하는 것은 비효율적

### 2. 싱글톤 패턴의 단점

- 의존성이 높아지며 TDD를 할 때 걸림돌이 된다. 단위 테스트는 테스트가 서로 독립적이고 테스트를 어떤 순서로든 실행할 수 있어야 하지만, 싱글톤 패턴은 미리 생성된 하나의 인스턴스를 기반으로 구현하는 패턴이므로 각 테스트마다 '독립적인' 인스턴스를 만들기가 어려움
  - 의존성이 높다 = 종속성이 높다. A가 B에 의존성이 있다는 것은 B의 변경 사항에 대해 A 또한 변해야함을 의미

#### 3. 예시

- 싱글톤이 아닌 클래스

```js
class Rectangle {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
}
const a = new Rectangle(1, 2);
const b = new Rectangle(1, 2);
console.log(a === b); // false. 서로 다른 인스턴스
```

- 싱글톤 패턴

```js
class Singleton {
  constructor() {
    if (!Singleton.instance) {
      Singleton.instance = this;
    }
    return Singleton.instance;
  }
  getInstance() {
    return this;
  }
}
const a = new Singleton();
const b = new Singleton();
console.log(a === b); // true. 동일 인스턴스
```

- DB 연결 모듈 (싱글톤 패턴)

```js
const URL = "mongodb://localhost:27017/kundolapp";
const createConnection = (url) => ({ url: url });
class DB {
  constructor(url) {
    if (!DB.instance) {
      DB.instance = createConnection(url); // 인스턴스가 없을 경우만 connect. 있으면  또 다시 connect 를 하지 않음
    }
    return DB.instance;
  }
  connect() {
    return this.instance;
  }
}
const a = new DB(URL);
const b = new DB(URL);
console.log(a === b); // true
```

- Mongoose 모듈
  -javascript로 서버를 만들고 MongoDB와 통신하기 위해서는 라이브러리가 필요 > mongoose 라이브러리가 사용됨

```js
Mongoose.prototype.connect = function (uri, options, callback) {
  const _mongoose = this instanceof Mongoose ? this : mongoose; // 싱글톤
  const conn = _mongoose.connection;
  return _mongoose._promiseOrCallback(callback, (cb) => {
    conn.openUri(uri, options, (err) => {
      if (err != null) {
        return cb(err);
      }
      return cb(null, _mongoose);
    });
  });
};

// 메인 모듈
const mysql = require("mysql");
const pool = mysql.createPool({
  connectionLimit: 10,
  host: "example.org",
  user: "kundol",
  password: "secret",
  database: "승철이디비",
});
pool.connect(); // connect는 1번
// 모듈 A
pool.query(query, function (error, results, fields) {
  if (error) throw error;
  console.log("The solution is: ", results[0].solution);
});
// 모듈 B
pool.query(query, function (error, results, fields) {
  if (error) throw error;
  console.log("The solution is: ", results[0].solution);
});
```

- java 싱글톤 패턴

```java
class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

public class HelloWorld{
     public static void main(String []args){
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b){
         System.out.println(true);
        }
     }
}
/*
705927765
705927765
true

1. 클래스안에 클래스(Holder), static이며 중첩된 클래스인 singleInstanceHolder를
기반으로 객체를 선언했기 때문에 한 번만 로드되므로 싱글톤 클래스의 인스턴스는 애플리케이션 당 하나만 존재
클래스가 두 번 로드되지 않기 때문에 두 스레드가 동일한 JVM에서 2개의 인스턴스를 생성할 수 없음
그렇기 때문에 동기화, 즉 synchronized를 신경쓰지 않아도 됨
2. final 키워드를 통해서 read only 즉, 다시 값이 할당되지 않음
3. 중첩클래스 Holder로 만들었기 때문에 싱글톤 클래스가 로드될 때 클래스가 메모리에 로드되지 않고
어떠한 모듈에서 getInstance()메서드가 호출할 때 싱글톤 객체를 최초로 생성 및 리턴
*/
```

- 싱글톤 패턴의 단점
  - mocha: javascript test 라이브러리
  - 첫 테스트에서 a[0] = 4로 변경하면 두 번째 test의 결과에 영향을 준다 -> 테스트 순서에 따라 결과가 달라질 수 있다

```js
// npm install -g mocha
// mocha single1.js
const assert = require("assert");
const a = [1, 2, 3];
describe("Array", function () {
  describe("#indexOf()", function () {
    it("should return -1 when the value is not present", function () {
      assert.equal(a.indexOf(4), -1);
      a[0] = 4;
    });
  });
  describe("#indexOf()", function () {
    it("should return -1 when the value is not present", function () {
      assert.equal(a.indexOf(4), -1);
    });
  });
});
// pass
// fail
```
