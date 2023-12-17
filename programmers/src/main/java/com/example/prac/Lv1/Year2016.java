package com.example.prac.Lv1;

public class Year2016 {

    public String solution(int a, int b) {

        int[] daysCntArray = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int days = b;

        for (int i = 0; i < a - 1; i++) {
            days += daysCntArray[i];
        }

        switch (days % 7) {
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            default:
                return "WED";
        }
    }
}
