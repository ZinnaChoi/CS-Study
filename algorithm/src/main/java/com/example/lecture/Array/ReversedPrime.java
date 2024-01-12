package com.example.lecture.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrime {

    public int[] mySolution(int[] nums) {

        List<Integer> answer = new ArrayList<>();

        for (int n : nums) {
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            int reversedNum = Integer.parseInt(sb.reverse().toString());
            if (isPrime(reversedNum))
                answer.add(reversedNum);

        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> teacherSolution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0; // reversed tmp
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if (isPrime(res))
                answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {

        ReversedPrime T = new ReversedPrime();

        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
        }

        for (int n : T.mySolution(nums)) {
            System.out.print(n + " ");
        }

        // for (int x : T.teacherSolution(N, nums)) {
        // System.out.print(x + " ");
        // }

        kb.close();
    }

}
