package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class TeacherLoadDogIntoCar {

    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c)
            return;
        if (L == n) {
            answer = Math.max(answer, sum);

        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }

    }

    public static void main(String[] args) {

        TeacherLoadDogIntoCar T = new TeacherLoadDogIntoCar();
        Scanner kb = new Scanner(System.in);

        c = kb.nextInt();
        n = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);

        kb.close();
    }
}
