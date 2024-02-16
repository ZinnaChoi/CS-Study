
class Calculator {
    // 오버로딩 매개변수의 개수, 타입을 다르게 정의 가능
    void multiply(int a, int b) {
        System.out.println("결과는 : " + (a * b) + "입니다.");
    }

    void multiply(int a, int b, int c) {
        System.out.println("결과는 : " + (a * b * c) + "입니다.");
    }

    void multiply(double a, double b) {
        System.out.println("결과는 : " + (a * b) + "입니다.");
    }

    // 오버로딩 매개변수의 순서를 바꿀 수도 있다
    void pay(String a, int b) {
        System.out.println(a + "가 " + b + "원만큼 계산합니다. ");
    }

    void pay(int a, String b) {
        System.out.println(b + "가 " + a + "원만큼 계산합니다. ");
    }
}

class Animal {
    void eat() {
        System.out.println("먹습니다.");
    }
}

// 오버라이딩
class Person extends Animal {
    @Override
    void eat() {
        System.out.println("사람처럼 먹습니다. ");
    }
}

public class MyClass {
    public static void main(String args[]) {

        // 메소드 오버로딩
        int a = 1;
        int b = 2;
        int d = 4;
        Calculator c = new Calculator();
        c.multiply(a, b);
        c.multiply(a, b, d);
        double aa = 1.2;
        double bb = 1.4;
        c.multiply(aa, bb);

        c.pay("영주", 1000000000);
        c.pay(1000000000, "영주");

        // 메소드 오버라이딩
        Person e = new Person();
        e.eat();
    }
}
