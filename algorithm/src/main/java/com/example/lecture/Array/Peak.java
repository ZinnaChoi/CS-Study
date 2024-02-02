package com.example.lecture.Array;

import java.util.Scanner;

public class Peak {

    int[] dx = { 1, 0, -1, 0 };
    int[] dy = { 0, 1, 0, -1 };

    public int mySoultion(int N, int[][] map) {
        int peakCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[i][j] < map[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    peakCnt++;
            }
        }
        return peakCnt;
    }

    public static void main(String[] args) {
        Peak T = new Peak();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.mySoultion(N, map));
        kb.close();
    }

}