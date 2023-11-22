# 자료구조의 기본

> 자료구조를 이해하기 위해 C++ 언어의 기본을 살펴보자

### 1. C++의 기본

```C++
#include <bits/stdc++.h> // --- (1)

using namespace std;// --- (2)
string a;// --- (3)
int main(){
    cin >> a;// --- (4)
    cout << a << "\n";// --- (5)
    return 0; // - (6)
}
```

- (1) 헤더 파일. STL 라이브러리를 import. 이 중 bits/stdc++.h는 모든 표준 라이브러리가 포함된 헤더

- (2) std라는 네임스페이스를 사용한다는 뜻. cin (입력)이나 cout(출력) 등을 사용할 때 원래는 std::cin 처럼 네임 스페이스를 달아서 호출해야 하는데 이를 기본으로 설정한다는 뜻

  - 네임스페이스 = 같은 클래스 이름 구별, 모듈화에 쓰이는 이름

- (3) 문자열의 선언 <타입> <변수명> = <값> ;

  - 이 때 변수 명이 lvalue(추후엗 ㅏ시 사용될 수 있는 변수), 값이 rvalue(한 번 쓰고 다시 사용되지 않는 변수)

- (4) 입력. 대표적으로 cin, scanf가 존재
- (5) 출력. 대표적으로 cout, printf가 존재
- (6) 리턴. 프로세스가 정상적으로 마무리됨을 뜻함

### 2. C++ 온라인 컴파일러

https://www.programiz.com/cpp-programming/online-compiler/
