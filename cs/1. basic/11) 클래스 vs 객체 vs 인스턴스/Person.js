class Person {
  constructor(name = "alanwalker", IQ = 100, str = 100) {
    this.name = name;
    this.IQ = IQ;
    this.str = str;
  }
  levelup() {
    this.IQ++;
    this.str++;
    console.log(
      this.name + "의 지능과 힘이 증가했습니다! " + this.IQ + " / " + this.str
    );
  }
}
const a = new Person(); // 디폴트인 alanwalker 인스턴스가 생성된다
a.levelup();
const b = new Person("홍철", 100, 1000);
b.levelup();
