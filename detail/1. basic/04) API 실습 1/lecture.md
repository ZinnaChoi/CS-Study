### API 실습 1: OPEN API를 사용해 온도 예측

> 서울시 온도 예측을 인공지능 모델이나 수치 모델을 사용하지 않고 OpenAPI를 사용하여 구현하자

### URI

"https://api.open-meteo.com/v1/forecast?latitude=37.57&longitude=126.98&hourly=temperature_2m&current_weather=true&timezone=Asia%2FTokyo"

- 위 URI를 브라우저에 입력 시 API의 response를 활용할 수 있다

- 프로토콜: https
- v1: API의 버전. API의 변경이 있을 때, v1 API는 그대로 놔두고, v1 API를 언제까지 서비스하겠다라는 것을 공지한 채 v2 API를 새로 만들어서 사용해야 한다.
- ? 뒤에는 쿼리

- 사용한 OPEN API
  https://open-meteo.com/en/docs#latitude=37.57&longitude=126.98&hourly=tempera

### index.html

- chart.js 사용

- load : 스타일시트 및 이미지와 같은 모든 종속 리소스를 포함하여 전체
  페이지가 로드될 때 (javascript및 DOM이 다 로드가 완료됨)

```
 window.onload = async () => {
  const ret = await fetch(OPEN_API).then((res) => res.json());
  draw(ret);
  };
```

- 결과 조회
  file:///C:/Users/yeahee/Desktop/practice/cs/1.%20basic/4)%20API%20%EC%8B%A4%EC%8A%B5%201/index.html
