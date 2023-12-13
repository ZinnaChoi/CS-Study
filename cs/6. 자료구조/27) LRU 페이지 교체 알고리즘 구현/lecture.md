# LRU 페이지 교체 알고리즘

> LRU = least recently used
>
> 1. 페이지가 캐시에 있는지 확인하고 2. 만약 없다면 가장 참조가 오래된 페이지와, 참조를 하려는 해당 페이지를 스와핑하는 알고리즘
>    => LinkedHashMap을 사용하여 구현해보자

- 참조: 스택으로도 구현 가능

### 로직

1. 페이지가 캐시에 있는지 확인
2. 페이지가 캐시에 없을 때 스와핑

- 가장 오래된 페이지 : LinkedHashMap의 첫번째 요소
- 최근 참조된 페이지: LinkedHashMap의 가장 마지막 요소

#### LinkedHashMap 이란?

> 해시 테이블과 연결리스트를 결합한 형태로 해시 테이블의 빠른 검색 속도와(최악의 시간복잡도가 아닌 조건 하에서), 연결리스트의 순서 유지 기능을 함께 제공

- LinkedHashMap<>(capacity, 0.75f, true)
  - 여기서 3번째 인자는 `accessOrder`로 ture로 설정하면 최근 접근 순서(LRU)이고, false 로 설정하면 삽입 순서

### 예시

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public void refer(int key) {
        if (!cache.containsKey(key)) {
            System.out.println("해당 페이지를 캐시에 추가: " + key);
        } else {
            System.out.println("해당 페이지를 캐시에서 접근: " + key);
        }
        cache.put(key, key);  // 페이지를 캐시에 추가하거나 캐시 내 위치를 최신화
    }

    public void display() {
        System.out.println(cache.keySet());
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        int[] testPages = {1, 3, 0, 3, 5, 6, 3};

        for (int page : testPages) {
            cache.refer(page);
            cache.display();
        }
    }
}

```

```

해당 페이지를 캐시에 추가: 1
[1]
해당 페이지를 캐시에 추가: 3
[1, 3]
해당 페이지를 캐시에 추가: 0
[1, 3, 0]
해당 페이지를 캐시에서 접근: 3
[1, 0, 3]
해당 페이지를 캐시에 추가: 5
[0, 3, 5]
해당 페이지를 캐시에 추가: 6
[3, 5, 6]
해당 페이지를 캐시에서 접근: 3
[5, 6, 3]

```
