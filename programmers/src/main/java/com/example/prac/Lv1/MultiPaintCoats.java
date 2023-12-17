package com.example.prac.Lv1;

public class MultiPaintCoats {
    public int solution(int n, int m, int[] section) {

        int[] diffList = new int[section.length - 1];
        for (int i = 0; i < section.length - 1; i++) {
            diffList[i] = section[i + 1] - section[i];
        }

        int roller = 1;
        int sum = 0;
        for (int d : diffList) {
            sum += d;
            if (sum >= m) {
                roller++;
                sum = 0;
            }
        }
        return roller;
    }
}
