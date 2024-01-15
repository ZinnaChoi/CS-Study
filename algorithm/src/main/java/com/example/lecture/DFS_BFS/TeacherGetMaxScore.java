package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class TeacherGetMaxScore {

    static int answer = Integer.MIN_VALUE, n, m;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {

        if (time > m)
            return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }

    }

    public static void main(String[] args) {
        TeacherGetMaxScore T = new TeacherGetMaxScore();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        int[] a = new int[n]; // 점수
        int[] b = new int[n]; // 시간

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }

        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
        kb.close();
    }

}
