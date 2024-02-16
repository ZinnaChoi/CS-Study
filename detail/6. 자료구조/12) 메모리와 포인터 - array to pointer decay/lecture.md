# 메모리와 포인터 - array to pointer decay

> 배열의 이름을 주소값으로 사용할 수 있다 = array to pointer decay(배열이 포인터로 부식되는 현상)

- 배열(array 가능, vector 불가)의 이름을 T\*라는 포인터에 할당하면서 T[N] 이라는 배열의 크기 정보 N이 없어지고, 첫 번째 요소의 주소가 바인딩되는 현상

```cpp
#include<bits/stdc++.h>
using namespace std;
int a[3] = {1, 2, 3};
int main(){
    int * c = a; // 배열의 크기 정보 3은 사라지고 포인터 c에 바인딩 됨
    cout << c << "\n";
    cout << &a[0] << "\n"; // 포인터 c에 배열 a의 첫 번째 요소의 주소가 바인딩 됨
    cout << c + 1 << "\n";
    cout << &a[1] << "\n";
    return 0;
    }
    /*
    0x472010
    0x472010
    0x472014
    0x472014
    */

```
