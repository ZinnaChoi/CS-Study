package com.example.lecture.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {

  public int BFS(int person, int calf) {
    Queue<Integer> Q = new LinkedList<>();
    boolean[] visited = new boolean[10001];
    Q.offer(person);
    visited[person] = true;
    int L = 0;

    while (!Q.isEmpty()) {
      int len = Q.size();
      for (int i = 0; i < len; i++) {
        int cur = Q.poll();
        if (cur == calf) return L;

        if (cur - 1 >= 1 && !visited[cur - 1]) {
          Q.offer(cur - 1);
          visited[cur - 1] = true;
        }
        if (cur + 1 <= 10000 && !visited[cur + 1]) {
          Q.offer(cur + 1);
          visited[cur + 1] = true;
        }
        if (cur + 5 <= 10000 && !visited[cur + 5]) {
          Q.offer(cur + 5);
          visited[cur + 5] = true;
        }
      }
      L++;
    }
    return -1;
  }

  public static void main(String[] args) {
    FindCalf T = new FindCalf();
    Scanner kb = new Scanner(System.in);

    int person = kb.nextInt();
    int calf = kb.nextInt();

    System.out.println(T.BFS(person, calf));

    kb.close();
  }
}
