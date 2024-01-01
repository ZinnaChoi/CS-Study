# Recursive Function

- 자신이 자기 자신을 호출하는 함수
- 재귀함수는 stack frame을 사용한다

![Alt text](image/image1.png)

# Recursive Binary

![Alt text](image/image2.png)

# Fibonacci

> 메모이제이션(Memoization)
> 미리 계산된 값을 저장하고 다음 번 똑같은 조건을 계산하게 될 때 값을 참조하게 설계하는 방법

```java
  public int DFS2(int n) {
    if (fibo2[n] > 0) return fibo2[n]; // 중요: 메모이제이션 사용 > 이미 구해진 값을 미리 return!
    if (n == 1) {
      return fibo2[n] = 1;
    } else if (n == 2) {
      return fibo2[n] = 1;
    } else return fibo2[n] = DFS2(n - 1) + DFS2(n - 2);
  }
```

![Alt text](image/image3.png)
