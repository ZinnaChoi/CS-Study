package com.example.prac.Lv2;

public class isValidBracket {

    boolean solution(String s) {
        if (s.charAt(s.length() - 1) == '(' || s.charAt(0) == ')')
            return false;

        String before = "";
        while (s.length() != before.length()) {
            before = s;
            s = s.replace("()", "");
        }

        System.out.println(s);

        return s.length() > 0 ? false : true;
    }
}
