package com.example.lecture.String;

import java.util.Scanner;

public class ExtractNum {

  public Integer mySolution(String str) {
    return Integer.parseInt(str.replaceAll("[^0-9]", ""));
  }

  public int teacherSolution1(String s) {
    int answer = 0;
    for (char x : s.toCharArray()) {
      if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
    }
    return answer;
  }

  public int teacherSolution2(String s) {
    String answer = "";
    for (char x : s.toCharArray()) {
      if (Character.isDigit(x)) answer += x;
    }
    return Integer.parseInt(answer);
  }

  public static void main(String[] args) {
    ExtractNum T = new ExtractNum();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution1(str));
    // System.out.println(T.teacherSolution2(str));
    kb.close();
  }
}
