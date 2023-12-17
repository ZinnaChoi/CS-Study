package com.example.prac.Lv1;

public class SplitString {
    public int solution(String s) {
        int splitCnt = 0;
        int sameCnt = 0;
        int diffCnt = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (sameCnt == 0) {
                temp = String.valueOf(s.charAt(i));
                sameCnt++;
            } else {
                if (temp.equals(String.valueOf(s.charAt(i)))) {
                    sameCnt++;
                } else {
                    diffCnt++;
                    if (sameCnt == diffCnt) {
                        splitCnt++;
                        sameCnt = 0;
                        diffCnt = 0;
                    }
                }
            }
        }
        if (sameCnt > 0 || diffCnt > 0) {
            splitCnt++;
        }
        return splitCnt;
    }
}
