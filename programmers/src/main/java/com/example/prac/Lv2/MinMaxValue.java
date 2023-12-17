package com.example.prac.Lv2;

import java.util.Arrays;

public class MinMaxValue {
    public String solution(String s) {

        String[] stringArr = s.split(" ");
        int[] intArr = new int[stringArr.length];

        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        Arrays.sort(intArr);

        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}
