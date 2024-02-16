# 웹 브라우저의 캐시 - 세션 스토리지

### 1. 정의

- 세션 스토리지와(session Storage)는 로컬 스토리지와 매우 유사
- 웹 스토리지 객체로 브라우저 내에 `{key:value}` 형태로 오리진에 종속되어 저장

  - 오리진이 같은 브라우저 내에서 공유

- 하나의 키에 오로지 하나의 값만 저장
- 최대 저장 용량 5MB

- ⭐ **사용자가 브라우저에서 탭을 닫으면 데이터는 만료** (로컬 스토리지와의 차이점!)

### 2. 사용법

- 설정 : `sessionStorage.setItem(key, value)`
- 탐색 : `sessionStorage.getItem(key)`
- 제거 : `sessionStorage.removeItem(key)`
- 전체제거 : `sessionStorage.clear()`
