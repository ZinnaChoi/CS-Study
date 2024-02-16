# 데이터 교환 형식 XML

> XML = Extensible Markup Language
> 마크업 형태를 쓰는 데이터 교환 형식

### 1. 마크업 형태

- 태그 등을 이용하여 문서나 데이터의 구조를 나타내는 방법

### 2. XML의 구성

1. 프롤로그: 버전, 인코딩
   ex) `<?xml version="1.0" encoding="UTF-8"?>`
2. 루트요소: 단 하나만
   ex) ` <OSTList>`
3. 하위요소들

```xml
<?xml version="1.0" encoding="UTF-8"?>
    <OSTList>
        <OST like="1">
            <name>마녀 배달부 키키</name> <song>따스함에 둘러쌓인다면</song>
        </OST>
        <OST like="2">
            <name>하울의 움직이는 성</name> <song>세계의 약속</song>
        </OST>
    </OSTList>
```

### 😗 **3. XML과 HTML의 차이** 😗

| 비교기준      | HTML                    | XML                                   |
| ------------- | ----------------------- | ------------------------------------- |
| 용도          | 데이터를 표시           | 데이터 저장 및 전송                   |
| 태그          | 미리 정해진 태그의 사용 | 사용자가 고유한 테그 만들고 정의 가능 |
| 대소문자 구분 | X                       | O                                     |

cf) XML에서 <book> 대신 <Book> 으로 태그를 작성하면 오류 발생.

### 😀 **4. JSON과 XML의 차이** 😀

- XML은 JSON과 비교했을 때, 닫힌 태그(앞 뒤로 태그가 있음)가 반복적으로 들어가기 때문에 JSON과 비교하면 무겁다.
- XML은 Javascript Object로 변환하기 위해서 JSON보다 많은 노력이 필요하다. (JSON은 JSON.parse()면 된다.)
  - 외부 라이브러리를 load 해야지만 json object로 바꿔서 사용할 수 있다.

### 5. XML의 활용

- sitemap.xml(사이트맵), 여러 언어에서 데이터 교환 형식으로 쓰임

#### sitemap.xml

SEO : search engine optimizer
원하는 서비스가 구글 등 검색 시 상단에 올라오도록 하는 기술

크롤링 봇: 서비스의 각 페이지들을 구글 db에 저장시켜주는걸 도와주는 로봇. home 페이지와 home에 종속적인 페이지들을 저장시킴
만약 독립적인 특정 page들이 있다면 크롤링 봇은 이를 알지 못함

=> 서비스를 생성할 때에는 sitemap.xml을 제출해줘야 -> 크롤링봇이 우리의 서비스를 크롤링 할 수 있게 해줌
