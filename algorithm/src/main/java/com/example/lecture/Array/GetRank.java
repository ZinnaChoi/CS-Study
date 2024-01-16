package com.example.lecture.Array;

import java.util.Scanner;

public class GetRank {

    public int[] mySolution(int N, int[] score) {
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = 1;
        }
        for (int i = 0; i < N; i++) {
            int cur = score[i];
            for (int j = 0; j < i; j++) {
                if (cur > score[j])
                    answer[j]++;
                else if (cur < score[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public int[] teacherSolution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i])
                    cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {

        GetRank T = new GetRank();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = kb.nextInt();
        }

        // for (int s : T.mySolution(score)) {
        // System.out.print(s + " ");
        // }
        for (int s : T.teacherSolution(N, score)) {
            System.out.print(s + " ");
        }

        kb.close();
    }
}
