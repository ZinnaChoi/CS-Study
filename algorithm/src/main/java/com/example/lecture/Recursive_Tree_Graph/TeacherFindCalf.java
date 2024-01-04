package com.example.lecture.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TeacherFindCalf {

  int[] dis = { 1, -1, 5 };
  int[] ch; //  방문 체크
  Queue<Integer> Q = new LinkedList<>();

  public int BFS(int s, int e) {
    ch = new int[10001];
    ch[s] = 1;
    Q.offer(s);
    int L = 0;

    while (!Q.isEmpty()) {
      int len = Q.size();
      for (int i = 0; i < len; i++) {
        int x = Q.poll();
        // if (x == e) return L;
        for (int j = 0; j < 3; j++) {
          int nx = x + dis[j]; // 이동한 위치
          if (nx == e) return L + 1;
          if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
            Q.offer(nx);
            ch[nx] = 1;
          }
        }
      }
      L++;
    }
    return 0;
  }

  public static void main(String[] args) {
    FindCalf T = new FindCalf();
    Scanner kb = new Scanner(System.in);

    int s = kb.nextInt();
    int e = kb.nextInt();

    System.out.println(T.BFS(s, e));

    kb.close();
  }
}
