const fs = require("fs"); // fs 모듈 호출
const path = require("path"); // path 모듈 호출

const a = fs.readFileSync(path.join(__dirname, "a.json"));
const b = JSON.parse(a); // 역직렬화 json을 javascript에서 사용하기 위해 json object로 변환 .
console.log(b[0].name.firstname); // 배열의 첫 원소(json의 name key에 해당하는 value 추출)
console.log(b[0]["name"]);
console.log(typeof b); // object

let cnt = 0;
if (b[0].name.firstname == "ju") {
  cnt++;
}
console.log(cnt);

const c = JSON.stringify(b); // 직렬화
console.log(c);
console.log(typeof c); // string

const prac1 = {
  지브리OST리스트: [
    {
      name: "마녀 배달부 키키",
      song: "따스함에 둘러쌓인다면",
    },
    {
      name: "하울의 움직이는 성",
      song: "세계의 약속",
    },
  ],
};
console.log(prac1.지브리OST리스트[0]);
console.log(prac1.지브리OST리스트[0].name);
console.log(prac1.지브리OST리스트[0]["song"]);

const prac2 = {
  name: "kundol",
  like: {
    아령: {
      weight: "10kg",
      feature: "육각형",
    },
    바나나: {
      color: "초록색",
    },
  },
};
