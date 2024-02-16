public class Person {
    // 멤버변수(속성)
    String name;
    int IQ;
    int str;
    private static final String GUDOC = "큰돌의 터전";

    // constructor
    public Person(String name, int IQ, int str) {
        this.name = name;
        this.IQ = IQ;
        this.str = str;
    }

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
    // static 사용 안하면 객체마다 talk라는 메서드를 선언해야 한다
    // public void talk(Person a, Person b){
    // System.out.println(a.name + " & " + b.name + "이 대화를 시작했다!");
    // }
    // main함수에서 사용할 때도 b.talk(a,b) 이런 식으로 객체마다 선언해주어야 함

    private static void talk(Person a, Person b) {
        System.out.println(a.name + " & " + b.name + "이 대화를 시작했다!");
    }

    public static void main(String[] args) {
        Person a = new Person(); // 객체 >> 인스턴스
        a.levelup();
        Person b; // 객체
        b = new Person("큰돌", 1000, 1); // 인스턴스
        b.levelup();
        Person.talk(a, b);
        System.out.println(Person.GUDOC);
    }
}
