# 라이브러리와 프레임워크의 비교

### 1. 라이브러리

- 공통으로 사용될 수 있는 특정한 기능들을 `모듈화`한 것. **폴더명, 파일명 등에 대한 규칙이 없고** 프레임워크에 비해 자유로움
  ex) 차(원하는 장소로 가는 경로를 마음대로 수정할 수 있다. custom 가능 자유도 놓음), axios

- axios

  - 규칙을 지켜줘야 함. Axios로 get 요청 보내고 싶다면 `axios.get()` 그리고 이후에 콜백함수 처리는 `.then(callback)` 등으로 해야 한다는 일정한 규칙 존재.
  - 이에 따라 해당 핸들러 함수를 넣어 http 요청을 하고 그 요청에 따른 응답에 대한 로직을 구현하면 된다

- 또한 라이브러리는 프레임워크 안에 넣을 수 있음
  - ex) Vue.js 프레임워크로 화면을 구축하고 그 안에 axios라는 라이브러리를 통해서 서버에 요청

```js
const axios = require("axios");
const url = "https://api.upbit.com/v1/market/all?isDetails=false";

axios
  .get(url)
  .then(function (response) {
    let data = response.data;
    console.log(data);
  })
  .catch(function (error) {
    console.log(error);
  })
  .finally(function () {
    console.log("I always execued");
  });
```

### 2. 프레임워크

- 공통으로 사용될 수 있는 특정한 기능들을 `모듈화`한 것. **폴더명, 파일명 등에 대한 규칙이 있으며** 라이브러리에 비해 조금 더 업격
  ex) 비행기(정해진 경로에 따라 이동해야 한다 자유도가 낮음. 대신에 제공되는 것들이 많음. 음식도 나오고... ), Vue.js, 장고(파이썬 프레임워크)

- 단순히 프레임워크만 사용해도 필요한 폴더나 파일이 생성되며, 기본 경로도 생성된다

- Vue.js
  - count 변수 ++ 하기 위해서는 data() 안에 변수를 선언해야 한다
  - style을 보면 scoped 키워드를 통해 해당 컴포넌트 기반에서만 작동되는 style임을 지정할 수 있다
  - 위와 같은 엄격한 규칙들이 존재. 라이브러리보다 좀 더 많은 기능 제공

```js
<script>
    export default {
    data() {
        return {
            count: 0
        }
    }
}
</script>
<template>
    <button @click="count++">Count is: {{ count }}</button>
</template>
<style scoped>
    button {
        font-weight: bold;
    }
</style>
```
