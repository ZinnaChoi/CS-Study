package com.example.lecture.Array;

import java.util.*;

public class PrintBigNumber {

    public int[] mySolution(int N, int[] nums) {

        List<Integer> filtered = new ArrayList<>();

        filtered.add(nums[0]);

        for (int i = 1; i < N; i++) {
            if (nums[i - 1] < nums[i]) {
                filtered.add(nums[i]);
            }
        }

        return filtered.stream().mapToInt(Integer::intValue).toArray();
    }

    public List<Integer> teacherSolution(int N, int[] nums) {

        List<Integer> filtered = new ArrayList<>();

        filtered.add(nums[0]);

        for (int i = 1; i < N; i++) {
            if (nums[i - 1] < nums[i]) {
                filtered.add(nums[i]);
            }
        }

        return filtered;
    }

    public static void main(String[] args) {

        PrintBigNumber T = new PrintBigNumber();

        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
        }
        int[] answer = T.mySolution(N, nums);
        // List<Integer> answer = T.teacherSolution(N, nums);

        for (int a : answer) {
            System.out.print(a + " ");
        }

        kb.close();
    }
}
