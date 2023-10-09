package com.example.prac.Lv2;

public class JadenCaseStr {

    public String solution(String s) {
        String[] sList = s.split("");

        StringBuilder sb = new StringBuilder();
        sb.append(sList[0].toUpperCase());

        for (int i = 1; i < sList.length; i++) {
            if (sList[i - 1].equals(" ")) {
                sb.append(sList[i].toUpperCase());
            } else {
                sb.append(sList[i].toLowerCase());
            }
        }
        return sb.toString();
    }

}
