package com.example.prac.Lv2;

import java.util.*;

public class FindPrime {
    static Set<Integer> answer = new HashSet<>();
    static char[] nums;
    static int[] ch;

    public int solution(String numbers) {
        nums = numbers.toCharArray();
        ch = new int[numbers.length()];
        DFS("");
        return answer.size();
    }

    private void DFS(String curr) {
        if (!curr.equals("")) {
            int num = Integer.parseInt(curr);
            if (isPrime(num))
                answer.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (ch[i] == 0) {
                ch[i] = 1;
                DFS(curr + nums[i]);
                ch[i] = 0;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
