# 셋 (Set)

> 고유한 요소만을 저장하는 자료구조로 중복을 허용하지 않음
> 중복되는 값은 제거되며 map과 같이 자동 정렬된다

### 시간 복잡도

- 참조 : O(logn)
- 탐색 : O(logn)
- 삽입 / 삭제 : O(logn)

```java
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> st2 = new TreeSet<>();

        st2.add(2);
        st2.add(1);
        st2.add(2);

        for (int it : st2) {
            System.out.println(it);
        }
    }
}
```

### Java에서 HashSet과 TreeSet의 차이

| 비교기준         | HashSet                                                   | TreeSet                                       |
| ---------------- | --------------------------------------------------------- | --------------------------------------------- |
| 내부 데이터 구조 | 해시테이블 사용.                                          | 이진검색트리사용 -> 요소가 정렬된 순서 유지   |
| 정렬             | 정렬되지 않음                                             | 오름차순 정렬되거나, comparator에 따라 정렬됨 |
| 성능특성         | 평균적으로 O(1)이지만 해시 충돌이 많을 때 O(n)            | O(logn) 균형잡힌 트리 구조이기 때문           |
| 사용사례         | 요소의 순서가 중요하지 않고, 빠른 삽입과 탐색이 필요할 때 | 요소들을 정렬된 순으로 유지해야 할 때         |
