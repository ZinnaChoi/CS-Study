package com.example.lecture.String;

import java.util.Scanner;

public class Password {

  public String mySolution(int N, String str) {
    String answer = "";
    for (int i = 0; i < N; i++) {
      String s = str.substring(i * 7, i * 7 + 7);
      s = s.replaceAll("#", "1").replaceAll("\\*", "0");
      answer += (char) (int) Integer.valueOf(s, 2);
    }
    return answer;
  }

  public String teacherSolution(int n, String s) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
      int num = Integer.parseInt(tmp, 2);
      answer += (char) num;
      s = s.substring(7);
    }
    return answer;
  }

  public static void main(String[] args) {
    Password T = new Password();
    Scanner kb = new Scanner(System.in);

    int N = kb.nextInt();
    String str = kb.next();
    System.out.println(T.mySolution(N, str));
    // System.out.println(T.teacherSolution(N, str));

    kb.close();
  }
}
