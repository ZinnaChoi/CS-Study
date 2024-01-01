package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class Fibonacci {

  public int[] mySolution(int[] fibo, int N) {
    if (N == 1 || N == 2) {
      fibo[N - 1] = 1;
      return fibo;
    } else {
      fibo[N - 1] =
        mySolution(fibo, N - 1)[N - 2] + mySolution(fibo, N - 2)[N - 3];
      return fibo;
    }
  }

  public int DFS(int n) {
    if (n == 1) return 1; else if (n == 2) return 1; else {
      return DFS(n - 2) + DFS(n - 1);
    }
  }

  private static int[] fibo2;

  public int DFS2(int n) {
    if (fibo2[n] > 0) return fibo2[n]; // 중요: 메모이제이션 사용 > 이미 구해진 값을 미리 return!
    if (n == 1) {
      return fibo2[n] = 1;
    } else if (n == 2) {
      return fibo2[n] = 1;
    } else return fibo2[n] = DFS2(n - 1) + DFS2(n - 2);
  }

  // 하지만 재귀보다 for문이 훨씬 성능이 좋다 => 반복 스택 프레임 호출이 없기 때문

  public static void main(String[] args) {
    Fibonacci T = new Fibonacci();
    Scanner kb = new Scanner(System.in);
    int N = kb.nextInt();
    int[] fibo = new int[N];

    fibo = T.mySolution(fibo, N);
    // for (int f : fibo) {
    //   System.out.print(f + " ");
    // }

    // for (int i = 1; i <= N; i++) {
    //   System.out.print(T.DFS(i) + " ");
    // }
    fibo2 = new int[N + 1];
    T.DFS2(N);
    for (int i = 1; i <= N; i++) {
      System.out.print(fibo2[i] + " ");
    }

    kb.close();
  }
}
