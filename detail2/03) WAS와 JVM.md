# JVM 기본 구조

## 1. JVM이란?
- Java Virtual Machine의 약자
- Java 바이트코드(.class 파일)를 실행하는 가상 머신
- 플랫폼 독립적인 실행 환경 제공
- "Write Once, Run Anywhere" 철학 구현

## 2. JVM 메모리 구조

```
┌─────────────────── JVM Memory ───────────────────┐
│                                                  │
│  ┌────────────── Heap Area ──────────────┐      │
│  │                                        │      │
│  │  ┌─ Young Generation ─┐  ┌─ Old Gen ─┐ │      │
│  │  │                    │  │           │ │      │
│  │  │ ┌─Eden─┐ ┌─S0─┐    │  │           │ │      │
│  │  │ │      │ │    │    │  │  Long-    │ │      │
│  │  │ │ New  │ │    │ S1 │  │  lived    │ │      │
│  │  │ │ Objs │ │    │    │  │  Objs     │ │      │
│  │  │ └──────┘ └────┘    │  │           │ │      │
│  │  └────────────────────┘  └───────────┘ │      │
│  └────────────────────────────────────────┘      │
│                                                  │
│  ┌───── Method Area ─────┐  ┌─── Meta Space ───┐ │
│  │ Class Info, Constants │  │ Class Metadata   │ │
│  │ Static Variables      │  │ (Java 8+)        │ │
│  └───────────────────────┘  └──────────────────┘ │
│                                                  │
│  Thread별 독립 영역:                                │
│  ┌─ Stack ─┐ ┌─ PC Reg ─┐ ┌─ Native Stack ─┐     │
│  │ Method  │ │ Current  │ │ JNI Methods    │     │
│  │ Frames  │ │ Instruc. │ │                │     │
│  └─────────┘ └──────────┘ └────────────────┘     │
└──────────────────────────────────────────────────┘
```

### Method Area (메소드 영역)
- 클래스 정보, 상수, static 변수 저장
- 모든 스레드가 공유하는 영역
- 런타임 상수 풀 포함

### Heap Area (힙 영역)
- 객체 인스턴스와 배열이 저장되는 영역
- 모든 스레드가 공유
- GC(Garbage Collection)의 주요 대상

#### Young Generation (신생 영역)
- **Eden Space**: 새로 생성된 객체들이 최초로 할당되는 영역
- **Survivor Space (S0, S1)**: Eden에서 살아남은 객체들이 이동하는 영역
  - From Survivor: 이전 GC에서 살아남은 객체들이 있는 영역
  - To Survivor: 다음 GC 시 객체들이 이동할 영역
  - S0와 S1 중 하나는 항상 비어있음 (교대로 사용)

#### Old Generation (구 영역)
- Young Generation에서 여러 번의 GC를 거쳐 살아남은 객체들이 저장
- 장기간 사용되는 객체들이 위치
- Young Generation보다 크기가 크고 GC 빈도가 낮음

#### Meta Space (Java 8+)
- 클래스 메타데이터 저장 (이전 Permanent Generation 대체)
- Native Memory 영역에 위치
- 동적으로 크기 조정 가능

#### Permanent Generation (Java 7 이하)
- 클래스 정보, 메소드 정보, 상수 풀 저장
- Java 8부터 Meta Space로 대체됨
- 고정 크기로 OutOfMemoryError 발생 가능성

#### GC 동작 과정

```
1. Minor GC 발생 시:
┌─ Young Generation ─────┐    ┌─ Old Generation ─┐
│ Eden    S0     S1      │    │                  │
│ [Full] [Old] [Empty]   │ => │                  │
│   │      │             │    │                  │
│   └──────┼──> [Copy] ──│────> [Promotion]      │
│          └──> [Clear]  │    │                  │
└────────────────────────┘    └──────────────────┘

2. 객체 생명주기:
New Object → Eden → Survivor(S0↔S1) → Old Generation
            ↓         ↓                    ↓
         Minor GC   Minor GC           Major GC
```

#### GC 종류
- **Minor GC**: Young Generation에서 발생하는 GC
  - Eden 영역이 가득 찰 때 실행
  - 상대적으로 빠른 속도
  - Survivor 영역 간 객체 이동
- **Major GC (Full GC)**: Old Generation 전체를 대상으로 하는 GC
  - 전체 힙 영역 정리
  - 시간이 오래 걸려 Stop-the-World 현상 발생

#### GC 객체 식별 기준

```
Root Set에서 Reachability 확인:

┌─ Root Set ────────────────┐
│ • Stack 지역변수            │
│ • Method Area static 변수  │───┐
│ • Native Method Stack     │   │
└───────────────────────────┘   │
                                │ 참조 추적
┌─ Heap Objects ─────────────┐  │
│                            │<─┘
│ [A] ──> [B] ──> [C]        │ ← Reachable (살려둠)
│                            │
│ [X] ──> [Y]    [Z]         │ ← Unreachable (GC 대상)
│                            │
└────────────────────────────┘
```

- **Reachability**: Root Set에서 참조 가능한지 여부
- **Root Set 구성요소**:
  - Stack의 지역 변수
  - Method Area의 static 변수
  - Native Method Stack의 JNI 참조
- **Unreachable 객체**: Root Set에서 참조할 수 없는 객체 → GC 대상

### Stack Area (스택 영역)
- 각 스레드마다 독립적으로 생성
- 메소드 호출 시 스택 프레임 생성
- 지역 변수, 매개변수, 리턴 주소 저장

### PC Register
- 각 스레드마다 하나씩 존재
- 현재 실행 중인 명령어의 주소 저장
- 스레드가 어떤 명령어를 실행할지 나타냄

### Native Method Stack
- Native 메소드를 위한 스택
- JNI(Java Native Interface)를 통해 호출되는 C/C++ 등의 코드 실행

## 3. JVM 실행 엔진

### Interpreter (인터프리터)
- 바이트코드를 한 줄씩 해석하여 실행
- 초기 실행 속도가 빠름

### JIT Compiler (Just-In-Time 컴파일러)
- 자주 사용되는 바이트코드를 네이티브 코드로 컴파일
- 반복 실행 시 성능 향상

### Garbage Collector
- 힙 영역의 사용하지 않는 객체 자동 제거
- 메모리 누수 방지

