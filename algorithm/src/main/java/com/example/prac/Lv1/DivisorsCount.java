package com.example.prac.Lv1;

public class DivisorsCount {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if ((int) Math.sqrt(i) * (int) Math.sqrt(i) == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}
