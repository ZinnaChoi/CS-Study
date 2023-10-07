package com.example.prac.Lv1;

import java.util.*;

public class NumberPair {
    public String solution(String X, String Y) {

        List<String> pair = new ArrayList<>();

        for (String s : Y.split("")) {
            if (X.contains(s)) {
                // X랑 Y에서 s의 반복 횟수 중 최소 횟수를 구함
                int minTimes = Math.min(X.length() - X.replaceAll(s, "").length(),
                        Y.length() - Y.replaceAll(s, "").length());
                for (int i = 0; i < minTimes; i++) {
                    pair.add(s);
                }
                X = X.replaceAll(s, "");
                Y = Y.replaceAll(s, "");
            }
        }

        String[] pairList = pair.toArray(new String[pair.size()]);

        Arrays.sort(pairList);

        StringBuilder sb = new StringBuilder();
        Boolean isAllZero = true;

        for (String p : pairList) {
            if (!p.equals("0")) {
                isAllZero = false;
            }
            sb.append(p);
        }

        if (sb.toString().isEmpty())
            return "-1";
        else if (isAllZero)
            return "0";

        return sb.reverse().toString();
    }
}
