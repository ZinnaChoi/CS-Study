package com.example.lecture.String;

import java.util.Scanner;

public class CompressString {

  public String mySolution(String str) {
    String answer = "";
    int cnt = 0;

    for (int i = 0; i < str.length(); i++) {
      cnt++;
      char next = i == str.length() - 1 ? ' ' : str.charAt(i + 1);
      if (next != str.charAt(i)) {
        answer += String.valueOf(str.charAt(i));
        if (cnt > 1) answer += String.valueOf(cnt);
        cnt = 0;
      }
    }
    return answer;
  }

  public String teacherSolution(String str) {
    String answer = "";
    str = str + " ";

    int cnt = 1;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) cnt++; else {
        answer += str.charAt(i);
        if (cnt > 1) answer += String.valueOf(cnt);
        cnt = 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    CompressString T = new CompressString();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution(str));

    kb.close();
    return;
  }
}
