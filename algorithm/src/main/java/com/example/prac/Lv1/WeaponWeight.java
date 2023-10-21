package com.example.prac.Lv1;

public class WeaponWeight {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 0; i < number; i++) {
            int weight = divisorCnt(i + 1);
            answer += (weight > limit) ? power : weight;
        }
        return answer;
    }

    private int divisorCnt(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt += Math.sqrt(n) == i ? 1 : 2;
            }
        }
        return cnt;
    }

}
