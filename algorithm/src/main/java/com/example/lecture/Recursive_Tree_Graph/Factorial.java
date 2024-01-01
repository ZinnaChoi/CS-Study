package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class Factorial {

  public int mySolution(int N) {
    if (N == 1) {
      return 1;
    } else {
      return N * mySolution(N - 1);
    }
  }

  public int DFS(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    Factorial T = new Factorial();

    Scanner kb = new Scanner(System.in);
    int N = kb.nextInt();

    T.mySolution(N);
    T.DFS(N);

    kb.close();
  }
}
