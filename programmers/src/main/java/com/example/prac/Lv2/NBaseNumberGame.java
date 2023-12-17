package com.example.prac.Lv2;

public class NBaseNumberGame {
    public String solution(int n, int t, int m, int p) {
        int num = 0;
        StringBuilder all = new StringBuilder();
        while (all.length() < t * m) {
            all.append(Integer.toString(num, n).toUpperCase());
            num++;
        }
        StringBuilder tube = new StringBuilder();
        for (int i = p - 1; i < t * m; i += m) {
            tube.append(all.charAt(i));
        }
        return tube.toString();
    }
}
