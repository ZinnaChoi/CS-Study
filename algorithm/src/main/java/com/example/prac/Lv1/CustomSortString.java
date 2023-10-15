package com.example.prac.Lv1;

import java.util.Arrays;

public class CustomSortString {
    public String[] solution(String[] strings, int n) {

        String[] converted = new String[strings.length];

        int idx = 0;
        for (String s : strings) {
            converted[idx] = s.charAt(n) + s.substring(0, n) + s.substring(n + 1, s.length());
            idx++;
        }

        Arrays.sort(converted);

        String[] answer = new String[strings.length];

        int num = 0;
        for (String c : converted) {
            answer[num] = c.substring(1, n + 1) + c.substring(0, 1) + c.substring(n + 1, c.length());
            num++;
        }

        return answer;
    }

}
