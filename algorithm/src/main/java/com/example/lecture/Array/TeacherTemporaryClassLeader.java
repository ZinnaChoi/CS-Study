package com.example.lecture.Array;

import java.util.Scanner;

public class TeacherTemporaryClassLeader {
    public int mySolution(int N, int[][] data) {

        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (data[i][k] == data[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TeacherTemporaryClassLeader T = new TeacherTemporaryClassLeader();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] data = new int[N + 1][6];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                data[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.mySolution(N, data));
        kb.close();
    }
}
