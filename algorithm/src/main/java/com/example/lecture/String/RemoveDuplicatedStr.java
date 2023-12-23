package com.example.lecture.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatedStr {

  public String mySolution(String str) {
    Set<Character> set = new HashSet<>();
    StringBuilder filteredStr = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (!set.contains(c)) {
        set.add(c);
        filteredStr.append(String.valueOf(c));
      }
    }
    return filteredStr.toString();
  }

  public String teacherSolution(String str) {
    String answer = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.indexOf(str.charAt(i)) == i) {
        answer += str.charAt(i);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    RemoveDuplicatedStr T = new RemoveDuplicatedStr();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    // System.out.println(T.mySolution(str));
    System.out.println(T.teacherSolution(str));

    return;
  }
}
