### Q1

```cpp
#include <bits/stdc++.h>
using namespace std;
int n;
int main()
{
    cin >> n;
    int a = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            a += i + j;
        }
    }
    cout << a << '\n';
    return 0;
}
```

=> O(n^2)

### Q2

```cpp
#include<bits/stdc++.h>
using namespace std;
int N, M;
void solve(int N, int M){
    int a = 1;
    for (int i = 0; i < N; i++) {
        a *= i;
    }
    for (int j = 0; j < M; j++) {
        a *= j;
    }
    cout << a << "\n";
}
int main(){
    cin >> N >> M;
    solve(N, M);
    return 0;
}
```

=> O(N+M)

### Q3

```cpp

#include<bits/stdc++.h>
using namespace std;
int n, a[1004], cnt;
int go(int l, int r){
    if(l == r) return a[l];
    int mid = (l + r) / 2;
    int sum = go(l, mid) + go(mid + 1, r);
    return sum;
}
int main(){
    cin >> n;
    for(int i = 1; i <= n; i++){
        a[i - 1] = i;
    }
    int sum = go(0, n - 1);
    cout << sum << '\n';
}
```

-> 2n - 1

- go 라는 함수가 몇번 호출되는지 디버깅

=> 0(n)
