package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class RecursiveFunction {

  public String mySolution(int N) {
    if (N == 1) {
      return "1";
    } else {
      return mySolution(N - 1) + " " + N;
    }
  }

  public void DFS(int n) {
    if (n == 0) return; else {
      DFS(n - 1);
      System.out.print(n + " ");
    }
  }

  public static void main(String[] args) {
    RecursiveFunction T = new RecursiveFunction();

    Scanner kb = new Scanner(System.in);
    int N = kb.nextInt();

    System.out.print(T.mySolution(N));
    // T.DFS(N);

    kb.close();
  }
}
