package com.example.lecture.String;

import java.util.Scanner;

public class ReverseSpecificWord {

  public String mySolution(String str) {
    char[] c = str.toCharArray();

    int lt = 0;
    int rt = str.length() - 1;
    while (lt < rt) {
      if (!isAlphabet(c[lt])) {
        lt++;
      }
      if (!isAlphabet(c[rt])) {
        rt--;
      }
      if (isAlphabet(c[lt]) && isAlphabet(c[rt])) {
        char tmp = c[lt];
        c[lt] = c[rt];
        c[rt] = tmp;
        lt++;
        rt--;
      }
    }

    return String.valueOf(c);
  }

  public Boolean isAlphabet(char c) {
    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) return true;
    return false;
  }

  public String teacherSolution(String str) {
    String answer;
    char[] s = str.toCharArray();

    int lt = 0;
    int rt = str.length() - 1;

    while (lt < rt) {
      if (!Character.isAlphabetic(s[lt])) lt++; else if (
        !Character.isAlphabetic(s[rt])
      ) rt--; else {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(s);
    return answer;
  }

  public static void main(String args[]) {
    ReverseSpecificWord T = new ReverseSpecificWord();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution(str));
    kb.close();
    return;
  }
}
