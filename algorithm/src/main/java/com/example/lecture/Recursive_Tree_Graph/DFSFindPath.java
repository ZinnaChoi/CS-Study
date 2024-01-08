package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

public class DFSFindPath {

    static int N;
    static int M;
    static int[][] graph;
    static int[] ch; // 노드 방문 체크 > 방문 : 1, 미방문 : 0
    static int cnt = 0;

    public void DFS(int cur) {
        if (cur == N) {
            cnt++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[cur][i] == 1 && ch[i] == 0) {
                    ch[i] = 1; // 방문 체크
                    DFS(i);
                    ch[i] = 0; // 백트래킹 > 현재 노드에 대한 탐색이 끝나고 이전 노드로 돌아갈 때, 현재 노드를 다시 방문할 수 있도록 '미방문 상태'로 되돌리는 역할
                }
            }
        }
    }

    public static void main(String[] args) {

        DFSFindPath T = new DFSFindPath();
        Scanner kb = new Scanner(System.in);
        N = kb.nextInt();
        M = kb.nextInt();
        graph = new int[N + 1][N + 1];
        ch = new int[N + 1];

        for (int i = 1; i <= M; i++) {
            int r = kb.nextInt();
            int c = kb.nextInt();
            graph[r][c] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(cnt);

        kb.close();
    }
}
