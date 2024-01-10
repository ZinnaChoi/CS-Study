package com.example.lecture.Array;

import java.util.Scanner;

public class Fibonacci {

    public int[] mySolution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < N; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    // 배열을 사용하지 않는 경우
    public void teacherSolution(int N) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        for (int i : T.mySolution(N)) {
            System.out.print(i + " ");
        }
        // T.teacherSolution(N);
        kb.close();

    }
}
