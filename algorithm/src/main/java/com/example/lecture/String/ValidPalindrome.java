package com.example.lecture.String;

import java.util.Scanner;

public class ValidPalindrome {

  public String mySolution(String str) {
    str = str.toUpperCase();
    int lt = 0;
    int rt = str.length() - 1;

    while (lt < rt) {
      if (!Character.isAlphabetic(str.charAt(lt))) lt++; else if (
        !Character.isAlphabetic(str.charAt(rt))
      ) rt--; else if (str.charAt(lt) != str.charAt(rt)) {
        return "NO";
      } else {
        lt++;
        rt--;
      }
    }
    return "YES";
  }

  public String teacherSolution(String str) {
    String answer = "NO";
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equals(tmp)) answer = "YES";
    return answer;
  }

  public static void main(String[] args) {
    ValidPalindrome T = new ValidPalindrome();

    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.mySolution(str));
    // System.out.println(T.teacherSolution(str));
  }
}
