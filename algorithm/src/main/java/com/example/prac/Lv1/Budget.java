package com.example.prac.Lv1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }

}