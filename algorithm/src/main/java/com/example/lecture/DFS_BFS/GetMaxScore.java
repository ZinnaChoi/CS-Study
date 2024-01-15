package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class GetMaxScore {

    static int N;
    static int M;
    static int maxScore = 0;

    public void DFS(int L, int score, int time, int[][] scoreTime) {
        if (time > M) {
            return;
        }
        if (L == N) {
            maxScore = Math.max(maxScore, score);
            return;
        } else {
            DFS(L + 1, score + scoreTime[L][0], time + scoreTime[L][1], scoreTime);
            DFS(L + 1, score, time, scoreTime);
        }
    }

    public static void main(String[] args) {
        GetMaxScore T = new GetMaxScore();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        int[][] scoreTime = new int[N][2];

        for (int i = 0; i < N; i++) {
            scoreTime[i][0] = kb.nextInt();
            scoreTime[i][1] = kb.nextInt();
        }

        T.DFS(0, 0, 0, scoreTime);
        System.out.println(maxScore);
        kb.close();
    }

}
