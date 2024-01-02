package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class PrintSubSet {

  static int n;
  static int[] ch;

  public void DFS(int L) {
    if (n + 1 == L) { // ch가 1인 인덱스 배열만 출력
      String tmp = "";
      for (int i = 1; i <= n; i++) {
        if (ch[i] == 1) tmp += (i + " ");
      }
      if (tmp.length() > 0) System.out.println(tmp); // 공집합 출력 안함
    } else {
      ch[L] = 1;
      DFS(L + 1);

      ch[L] = 0;
      DFS(L + 1);
    }
  }

  public static void main(String[] args) {
    PrintSubSet subSet = new PrintSubSet();

    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();
    ch = new int[n + 1];

    subSet.DFS(1);
    kb.close();
  }
}
