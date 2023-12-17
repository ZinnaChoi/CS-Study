package com.example.prac.Lv2;

public class ExpressNumber {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        answer++; // n = n
        return answer;
    }
}
