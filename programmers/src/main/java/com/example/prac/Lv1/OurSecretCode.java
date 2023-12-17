package com.example.prac.Lv1;

public class OurSecretCode {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (char c : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    i--;
                }
            }
            answer += c;
        }
        return answer;
    }
}