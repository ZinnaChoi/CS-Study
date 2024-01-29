package com.example.lecture.Array;

import java.util.Scanner;

public class GridMaxSum {

    public int mySolution(int N, int[][] grid) {

        int max = Integer.MIN_VALUE;
        int sum1, sum2, cross1, cross2;

        // 가로 합, 세로합
        for (int i = 0; i < N; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum1 += grid[i][j];
                sum2 += grid[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        // 대각선 합
        cross1 = cross2 = 0;
        for (int i = 0; i < N; i++) {
            cross1 += grid[i][i];
            cross2 += grid[N - i - 1][i];
        }
        max = Math.max(max, cross1);
        max = Math.max(max, cross2);

        return max;
    }

    public static void main(String[] args) {

        GridMaxSum T = new GridMaxSum();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.mySolution(N, grid));

        kb.close();
    }

}
