package com.example.lecture.String;

import java.util.Scanner;

public class IsPalindrome {

  public String mySolution(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    if (reversed.equalsIgnoreCase(str)) return "YES"; else return "NO";
  }

  public String teacherSolution1(String str) {
    int len = str.length();
    str = str.toUpperCase();
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        return "NO";
      }
    }
    return "YES";
  }

  public String teacherSolution2(String str) {
    String tmp = new StringBuilder(str).reverse().toString();
    String answer = "NO";
    if (str.equalsIgnoreCase(tmp)) answer = "YES";
    return answer;
  }

  public static void main(String[] args) {
    IsPalindrome T = new IsPalindrome();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution1(str));
    // System.out.println(T.teacherSolution2(str));
  }
}
