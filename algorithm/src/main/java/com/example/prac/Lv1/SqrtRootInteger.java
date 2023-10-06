package com.example.prac.Lv1;

public class SqrtRootInteger {

    public long solution(long n) {
        double x = Math.sqrt(n);
        return (int) x / 1 == x ? ((long) x + 1) * ((long) x + 1) : -1;
    }

}
