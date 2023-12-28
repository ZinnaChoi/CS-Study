package com.example.lecture.String;

import java.util.*;

public class ReverseWord {

  public String[] mySolution(int N, String[] str) {
    String[] reversedStr = new String[N];
    for (int i = 0; i < N; i++) {
      StringBuilder sb = new StringBuilder(str[i]);
      reversedStr[i] = sb.reverse().toString();
    }
    return reversedStr;
  }

  public ArrayList<String> teacherSolution1(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for (String x : str) {
      String tmp = new StringBuilder(x).reverse().toString();
      // String 은 String 끼리의 연산 시 새로운 String 객체를 생성 -> StringBuilder는 새로운 객체를 만들지 않아 메모리 낭비가 없음
      answer.add(tmp);
    }
    return answer;
  }

  public ArrayList<String> teacherSolution2(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for (String x : str) {
      char[] s = x.toCharArray();
      int lt = 0;
      int rt = x.length() - 1;

      while (lt < rt) {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
      String tmpString = String.valueOf(s);
      answer.add(tmpString);
    }

    return answer;
  }

  public static void main(String[] args) {
    ReverseWord T = new ReverseWord();

    Scanner kb = new Scanner(System.in);
    int N = kb.nextInt();
    String[] str = new String[N];
    for (int i = 0; i < N; i++) {
      str[i] = kb.next();
    }
    // for (String x : T.mySolution(N, str)) {
    //   System.out.println(x);
    // }
    // for (String x : T.teacherSolution1(N, str)) {
    //   System.out.println(x);
    // }
    for (String x : T.teacherSolution2(N, str)) {
      System.out.println(x);
    }
    kb.close();
    return;
  }
}
