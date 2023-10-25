package com.example.prac.Lv2;

public class RepeatBinaryConversion {
    public int[] solution(String s) {

        int changeCnt = 0;
        int removeCnt = 0;

        while (!s.equals("1")) {
            for (String str : s.split("")) {
                if (str.equals("0"))
                    removeCnt++;
                s = s.replaceAll("0", "");
            }
            s = String.valueOf(Integer.toString(s.length(), 2));
            changeCnt++;
        }
        int[] answer = { changeCnt, removeCnt };
        return answer;
    }
}
