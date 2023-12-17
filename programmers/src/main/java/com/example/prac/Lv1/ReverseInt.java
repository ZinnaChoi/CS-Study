package com.example.prac.Lv1;

import java.util.*;

public class ReverseInt {

    public long solution(long n) {

        String result = "";
        String[] charList = String.valueOf(n).split("");

        Arrays.sort(charList);

        for (int i = charList.length - 1; i >= 0; i--) {
            result += charList[i];
        }
        return Long.valueOf(result);
    }

}
