package com.example.prac.Lv1;

public class CalculateGCDLCM {
    public int[] solution(int n, int m) {

        int answer1 = 0;
        int answer2 = 0;
        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer1 = i;
                break;
            }
        }
        for (int i = Math.max(n, m); i <= n * m; i++) {
            if (i % m == 0 && i % n == 0) {
                answer2 = i;
                break;
            }
        }

        int[] answer = { answer1, answer2 };
        return answer;
    }
}
