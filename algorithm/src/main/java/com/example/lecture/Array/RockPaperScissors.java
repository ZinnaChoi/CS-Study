package com.example.lecture.Array;

import java.util.Scanner;

public class RockPaperScissors {

    public String[] mySolution(int N, int[] a, int[] b) {
        String[] answer = new String[N];

        for (int i = 0; i < N; i++) {
            if (a[i] == b[i]) {
                answer[i] = "D";
            } else if (a[i] == b[i] - 2 || a[i] == b[i] + 1) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }
        return answer;
    }

    public String teacherSolution(int N, int[] a, int[] b) {
        String answer = "";

        for (int i = 0; i < N; i++) {
            if (a[i] == b[i])
                answer += "D";
            else if (a[i] == 1 && b[i] == 3)
                answer += "A";
            else if (a[i] == 2 && b[i] == 1)
                answer += "A";
            else if (a[i] == 3 && b[i] == 2)
                answer += "A";
            else
                answer += "B";
        }
        return answer;

    }

    public static void main(String[] args) {

        RockPaperScissors T = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < N; i++) {
            b[i] = kb.nextInt();
        }

        for (String winner : T.mySolution(N, a, b)) {
            System.out.println(winner);
        }

        // for (char x : T.teacherSolution(N, a, b).toCharArray()) {
        // System.out.println(x);
        // }

        kb.close();
    }

}
