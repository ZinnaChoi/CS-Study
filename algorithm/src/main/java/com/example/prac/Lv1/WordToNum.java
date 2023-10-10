package com.example.prac.Lv1;

public class WordToNum {

    public int solution(String s) {

        String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(word[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }

}
