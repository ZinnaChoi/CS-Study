package com.example.lecture.Array;

import java.util.Scanner;

public class VisibleStudentsCnt {

    public int mySolution(int N, int[] heights) {

        int cnt = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (heights[i] > max) {
                max = heights[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        VisibleStudentsCnt T = new VisibleStudentsCnt();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = kb.nextInt();
        }
        System.out.println(T.mySolution(N, heights));

        kb.close();
    }
}
