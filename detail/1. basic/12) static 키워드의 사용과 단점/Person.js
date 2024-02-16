class Person {
  constructor(name = "alanwalker", IQ = 100, str = 100) {
    this.name = name;
    this.IQ = IQ;
    this.str = str;
  }
  levelup() {
    this.IQ += 1;
    this.str += 1;
    console.log(
      this.name + "의 지능과 힘이 증가했습니다! " + this.IQ + " / " + this.str
    );
  }
  static talk(a, b) {
    console.log(a.name + " & " + b.name + "이 대화를 d시작했다!");
  }
  static GUDOC = "큰돌의 터전";
}

const a = new Person();
a.levelup();
const b = new Person("큰돌", 1000, 1);
b.levelup();
Person.talk(a, b);
console.log(Person.GUDOC);
