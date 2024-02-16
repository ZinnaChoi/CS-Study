public class Person {
    // 멤버변수(속성)
    String name;
    int IQ;
    int str;

    // constructor
    public Person(String name, int IQ, int str) {
        this.name = name;
        this.IQ = IQ;
        this.str = str;
    }

    // Person a = new Person(); 처럼 아무런 매개변수 선언 안할 때 디폴트로 생성되는 객체
    public Person() {
        this.name = "alanwalker";
        this.IQ = 100;
        this.str = 100;
    }

    // 메서드
    public void levelup() {
        this.IQ = this.IQ + 1;
        this.str = this.str + 1;
        System.out.println(this.name + "의 지능과 힘이 증가했습니다!" + this.IQ + " / " + this.str);
    }

    public static void main(String[] args) {
        Person a = new Person(); // 객체 >> 인스턴스
        a.levelup();
        Person b; // 객체
        b = new Person("홍철", 1, 1000); // 인스턴스
        b.levelup();
    }
}
