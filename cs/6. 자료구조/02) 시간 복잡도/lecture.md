# 시간 복잡도

> 입력 크기에 대해 어떠한 알고리즘이 실행되는데 걸리는 시간. 주요 로직의 반복 횟수를 중점으로 측정된다

```js
console.time("test");
let sum = 0;
for (let i = 0; i < 1000000; i++) {
  sum += 1;
}
console.timeEnd("test");
// test: 1.575ms
```

- 위와 같은 시간이라는 것은 컴퓨터 사양 등 여러가지 요소에 영향을 받는다
- 시간 복잡도를 설명할 때는 시간이 아니라, 어떠한 알고리즘이 주어진 입력 크기를 기반으로 어떠한 로직이 몇 번 반복되었는가를 중점으로 설명

ex)

```cpp
for(int i = 0; i < 10; i++){  // 10번
    for(int j =0; j < n; j++){  //n번
        for(int k = 0; k < n; k++){  //n번
            if(true) cout << k << '\n';  //단순한 로직
            }
        }
    }
for(int i = 0; i < n; i++){ // n번
    if(true) cout << i << '\n';
}
```

=> 시간 복잡도? 10n^2 + n
