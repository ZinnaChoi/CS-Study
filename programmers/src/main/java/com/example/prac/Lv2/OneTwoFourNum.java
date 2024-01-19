package com.example.prac.Lv2;

public class OneTwoFourNum {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remain = n % 3;
            n /= 3;

            if (remain == 0) {
                remain = 4;
                n -= 1;
            }
            answer.insert(0, remain);
        }

        return answer.toString();
    }
}
