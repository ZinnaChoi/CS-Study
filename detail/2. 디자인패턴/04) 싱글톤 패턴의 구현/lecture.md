# 싱글톤 패턴을 구현하는 7가지 방법

- 면접에서 디자인 패턴이 나온다면 개념 정도를 물어보지 구현은 잘 물어보지 않지만, 자바 개발자라면 싱글톤 패턴을 구현하는 7가지 방법이 유용

### 1. 단순한 메서드 호출

> 싱글톤 패턴 생성 여부를 확인하고 싱글톤이 없으면 새로 만들고 있다면 만들어진 인스턴스를 반환

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

- 위 단순한 매서드 호출 코드의 단점: 원자성 결여
- 자바는 multi thread 언어
  - thread 1 -> .getInstance() 호출
  - thread 2 -> .getInstance() 호출
  - 두 개의 thread가 동시에 호출되면 인스턴스가 여러 개 생성될 수도 있다.

### 2. synchronized

> 인스턴스를 바환하기 전까지의 격리 공간에 놓기 위해 synchronized 키워드로 잠금을 할 수 있음. 최초로 접근한 스레드가 해당 메서드 호출 시에 다른 스레드가 접근하지 못하도록 잠금(lock)을 걸어줌

- thread safe
- getInstance()를 호출할 때마다 lock이 걸려 성능 저하

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

```

### 3. 정적 멤버

> 정적(static) 멤버나 블록은 런타임이 아니라 최초에 JVM이 클래스 로딩 때 모든 클래스들을 로드할 때 미리 인스턴스를 생성하는데 이를 이용한 방법
> 클래스 로딩과 동시에 싱글톤 인스턴스를 생성하여 모듈들이 싱글톤 인스턴스를 요청할 때 만들어진 인스턴스를 반환하면 된다

- 단점: 불필요한 자원 낭비. 싱글톤 인스턴스가 필요 없는 경우에도 무조건 싱글톤 클래스를 호출해 인스턴스를 만들어야 하기 때문

```java
public class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;

    }
}
```

### 4. 정적 블록

> 정적(static) 블록을 사용해도 된다.

```java
public class Singleton {
    private static Singleton instance = null;
    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
```

### 5. 정적 멤버와 Lazy Holder(중첩 클래스)

> singleInstanceHolder라는 내부 클래스를 하나 더 만듦으로써, Singleton JVM 클래스 로딩 시에 초기화가 되지 않고, getInstance()가 호출 될 때 정적 singleInstanceHolder 클래스가 로딩되어 인스턴스를 생성

- 모듈들이 필요로 할 때만 정적 멤버로 선언. 불필요한 자원 할당 방지

```java
class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}
```

### 6. 이중 확인 잠금(DCL)

> Double check Locking
> 인스턴스 생성 여부를 싱글톤 패턴 잠금 전에 한 번, 객체를 생성하기 전에 한 번 2번 체크하면 인스턴스가 존재하지 않을 때만 잠금을 걸 수 있음

```java
public class Singleton {
    private volatile Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) { // 인스턴스가 없을 때만
            synchronized (Singleton.class) {  // 잠금을 걸어버림
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

cf) **volatile(볼레틀)** : 변수 선언시 volatile을 지정하게 되면 값을 메인 메모리에만 적재

- 일반적인 경우 메인 메모리로부터 읽어온 값을 CPU 캐시에 저장하지만 멀티 쓰레드 애플리케이션에서는 각 쓰레드를 통해 CPU에 캐싱한 값이 상이할 수 있음

- 즉, 변수의 값이 메인 메모리에만 저장되며, 멀티 쓰레드 환경에서 메인 메모리의 값을 참조하므로 변수 값 불일치 문제를 해결할 수 있게 해주는 키워드.CPU 캐시를 참조하는 것보다는 성능이 떨어짐

### 7. enum

> enum 인스턴스는 기본적으로 스레드 세이트한 점이 보장되기 때문에 이를 통해 생성할 수 있음

```java
public enum SingletonEnum {
    INSTANCE;
    public void oortCloud(){

    }
}
```

### 정리

- 5번과 7번 추천
  - 5번 = 중첩 클래스 lazy holder
  - 7번 = enum
