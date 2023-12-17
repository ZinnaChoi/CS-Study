package com.example.prac.Lv1;

import java.util.Arrays;

public class ReverseStr {
    public String solution(String s) {

        String[] sList = s.split("");

        Arrays.sort(sList);

        StringBuilder sb = new StringBuilder();
        for (String str : sList) {
            sb.append(str);
        }

        return sb.reverse().toString();
    }
}
