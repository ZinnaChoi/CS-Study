# JSON 직렬화 역직렬화

> 정의: javascript 객체 문법으로 구조화된 데이터 교환 형식

### 1. Javascript 객체 문법

- key와 value로 구성
- 이미 존재하는 키를 중복선언하면 나중에 선언한 해당 키에 대응한 값이 덮어쓰이게 됨
- 여러 개의 json 표현하고 싶을 때는 -> 배열 사용 (json array)

예시>

```
[
  {
    "name": {
      "firstname": "ju",
      "lastname": "hong"
    },
    "age": 30
  },
  {
    "name": "yang",
    "name": "king",
    "age": 30
  }
]
```

js: JSON.parse()
python: Json.loads

### 2. 데이터 교환 형식

json = 대표적 데이터 교환 형식
ex) 보고서 쓸 때 양식에 맞춰서 전달

### 3. 여러 언어에서 **독립적으로** 쓰임

- 객체, 해시테이블, 딕셔너리 등으로 변환되어 쓰임

여러가지 언어에 대해 독립적으로 쓰인다
cf) javascript가 버전 업데이트 했다고, python이 업데이트 했다고 JSON에 영향을 끼치지 않는다

- javascript에서 JSON을 사용할 떄는 JSON을 javascript object로 변환하여 사용해야 한다. (JSON.parse)
- python에서 json 사용하기 위해 JSON을 dictionary로 (JSON.loads)

### 4. 단순 배열, 문자열 표현 가능

```
[1,2,3,4]
```

```
"vlzkvlzkvlzk"
```

이런 값들도 json에 해당된다
하지만 보통 JSON은 key value 형태로 사용된다.

JSON의 value들은 다른 타입을 가지고 있어도 괜찮지만,
될수 있으면 타입(스키마)를 맞추어 정의해 두는 것이 좋다
name: String
song: String

### 5.JSON의 타입

- 수, 문자열, Boolean, 배열, 객체, null
- javascript의 object와 유사하지만
  undifined 나 method는 value로 올 수 없다
  cf) javascript는 undifined 나 method가 object로 올 수 있음

```javascript
const a = {
  a: () => {
    console.log(1);
  },
  b: undefined,
};
```

### 6. JSON 직렬화 / 역직렬화

직렬화: 외부의 시스템에도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술 (<-> 역직렬화)

JSON.parse() 역 직렬화
JSON.stringify() 직렬화

역직렬화 예시)
JSON -> js json object
JSON -> py dictionary

cf) jsobject 결과물을 python으로 넘기려면? json거쳐서 옮겨야 한다.
외부 시스템도 사용할 수 있도록 직렬화 후 역직렬화 과정 필요하다
js object - json.stringify() -> 문자열로 변환된다.(직렬화)

직렬화 : 외부의 시스템(js 입장에서 python) 에도 사용할 수 있도록 데이터를 변환하는 기술

### 7. json 활용

- 프로그래밍 언어와 프레임워크 등에 독립적 => 서로 다른 시스템 간 데이터 교환에 유리
- API의 반환 형태
- 설정 파일
  ex) package.json
