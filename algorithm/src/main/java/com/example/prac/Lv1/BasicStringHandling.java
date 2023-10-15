package com.example.prac.Lv1;

public class BasicStringHandling {
    public boolean solution(String s) {

        boolean answer = false;

        if (s.length() == 4 || s.length() == 6) {
            boolean allNum = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' < 0 || s.charAt(i) - '0' > 9) {
                    allNum = false;
                }
            }
            if (allNum)
                answer = true;
        }

        return answer;
    }
}
