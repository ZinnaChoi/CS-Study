package com.example.lecture.String;

import java.util.Scanner;

public class FindStr {

  public int mySolution(String str, char c) {
    str = str.toUpperCase();
    c = Character.toUpperCase(c);
    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) cnt++;
    }
    return cnt;
  }

  public int teacherSolution(String str, char t) {
    int answer = 0;
    str = str.toUpperCase();
    t = Character.toUpperCase(t);
    // System.out.println(str + " " + t);

    // 방법 2
    for (char x : str.toCharArray()) {
      if (x == t) answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    // static에서 instance 메서드 호출하기 위해서는 class 객체 생성이 필요
    FindStr T = new FindStr();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    // kb.next()는 String 형태이기에 char로 변환 필요
    char c = kb.next().charAt(0);

    // System.out.print(T.mySolution(str, c));
    System.out.print(T.teacherSolution(str, c));
    return;
  }
}
