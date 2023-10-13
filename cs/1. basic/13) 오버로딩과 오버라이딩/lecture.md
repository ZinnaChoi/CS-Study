# 오버로딩과 오버라이딩

### 1. 오버로딩 (Overloading)

> 이름이 같아도 매개변수 개수, 타입, 순서를 다르게 해서 같은 이름으로도 여러 개의 함수를 정의할 수 있는 것.

- 프로그램의 유연성을 높이고 결과적으로 코드를 깔끔하게 하는 효과가 있으며, 같은 클래스 내에서 사용합니다.

- MyClass.java 참조
- java 뿐만 아니라 c++과 같은 다른 언어에서도 쓰임. (되는 언어가 있고 안되는 언어가 있음)

### 2. 오버라이딩 (Overriding)

> 상위 클래스가 가지고 있는 메서드를 하위 클래스가 **재정의**하는 것. 상속 관계 클래스에서 사용되며 static, final로 선언한 메서드는 오버라이딩이 불가능하다.

- Animal Class > Person class

- Myclass.java 참조

- 또한 오버라이딩 진행 시 interface 기반으로 구체적인 함수 정의는 하지 않고, 이를 기반으로 여러 개의 하위 클래스를 만들어 오버라이딩을 하기도 함

```java
interface Animal{
    public void eat();
}
class Person implements Animal{
    @Override
    public void eat(){
        System.out.println("사람처럼 먹습니다. ");
    }
}
public class MyClass {
    public static void main(String args[]) {
        Person a = new Person();
        a.eat();
    }
}
```
