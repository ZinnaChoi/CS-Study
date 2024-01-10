package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class EqualSumSubset {

    static int N;
    static int[] nums;
    static int totalSum;

    public String DFS(int L, int sum) {
        if (sum * 2 == totalSum)
            return "YES";
        if (L == N) {
            return "NO";
        } else {
            if (DFS(L + 1, sum + nums[L]).equals("YES"))
                return "YES";
            if (DFS(L + 1, sum).equals("YES"))
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {

        EqualSumSubset T = new EqualSumSubset();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        nums = new int[N];
        totalSum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
            totalSum += nums[i];
        }

        if (totalSum % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println(T.DFS(0, 0));
        }

        kb.close();

    }
}
