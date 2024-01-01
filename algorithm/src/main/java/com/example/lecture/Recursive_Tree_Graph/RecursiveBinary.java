package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class RecursiveBinary {

  public void mySolution(int N) {
    if (N == 0) return;
    mySolution(N / 2);
    N = N % 2;
    System.out.print(N);
  }

  public void DFS(int n) {
    if (n == 0) return; else {
      DFS(n / 2);
      System.out.println(n % 2);
    }
  }

  public static void main(String[] args) {
    RecursiveBinary T = new RecursiveBinary();
    Scanner kb = new Scanner(System.in);
    int N = kb.nextInt();

    T.mySolution(N);
    T.DFS(N);

    kb.close();
  }
}
