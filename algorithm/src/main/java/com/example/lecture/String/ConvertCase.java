package com.example.lecture.String;

import java.util.Scanner;

public class ConvertCase {

  public String mySolution(String str) {
    StringBuilder converted = new StringBuilder();
    for (char s : str.toCharArray()) {
      converted.append(
        s - 'Z' > 0
          ? String.valueOf(s).toUpperCase()
          : String.valueOf(s).toLowerCase()
      );
    }
    return converted.toString();
  }

  public String teacherSolution1(String str) {
    String answer = "";
    for (char x : str.toCharArray()) {
      if (Character.isLowerCase(x)) answer +=
        Character.toUpperCase(x); else answer += Character.toLowerCase(x);
    }
    return answer;
  }

  // 아스키 숫자 - 대문자: 65~90, 소문자 97~122 (소문자 - 32 = 대문자)
  public String teacherSolution2(String str) {
    String answer = "";
    for (char x : str.toCharArray()) {
      if (x >= 97 && x <= 122) answer += (char) (x - 32); else answer +=
        (char) (x + 32);
    }
    return answer;
  }

  public static void main(String[] args) {
    ConvertCase T = new ConvertCase();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    //System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution1(str));
    System.out.println(T.teacherSolution2(str));
    kb.close();
    return;
  }
}
