package com.example.lecture.Array;

import java.util.Scanner;

public class CalculateScore {

    public int mySolution(int[] score) {
        int answer = 0;
        int add = 0;
        for (int s : score) {
            if (s == 1) {
                add++;
                answer += add;
            } else {
                add = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        CalculateScore T = new CalculateScore();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = kb.nextInt();
        }
        System.out.println(T.mySolution(score));
        kb.close();
    }

}
