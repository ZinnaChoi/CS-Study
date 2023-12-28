package com.example.lecture.String;

import java.util.*;

public class ShortestWordDistance {

  public int[] mySolution(String word, char ch) {
    List<Integer> matchedIdx = new ArrayList<>();
    int[] answer = new int[word.length()];

    for (int i = 0; i < word.length(); i++) {
      answer[i] = 100;
      if (word.charAt(i) == ch) matchedIdx.add(i);
    }

    for (int j = 0; j < matchedIdx.size(); j++) {
      for (int i = 0; i < word.length(); i++) {
        if (Math.abs(matchedIdx.get(j) - i) < answer[i]) {
          answer[i] = Math.abs(matchedIdx.get(j) - i);
        }
      }
    }
    return answer;
  }

  public int[] teacherSolution(String s, char t) {
    int[] answer = new int[s.length()];

    int p = 100;
    // 왼쪽 t로부터의 거리
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == t) p = 0; else p++;
      answer[i] = p;
    }
    // 오른쪽 t로부터의 거리
    p = 100;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == t) p = 0; else p++;
      answer[i] = Math.min(answer[i], p);
    }

    return answer;
  }

  public static void main(String[] args) {
    ShortestWordDistance T = new ShortestWordDistance();

    Scanner kb = new Scanner(System.in);
    String word = kb.next();
    char ch = kb.next().charAt(0);
    for (int i : T.mySolution(word, ch)) {
      System.out.print(i + " ");
    }
    // for (int i : T.teacherSolution(word, ch)) {
    //   System.out.print(i + " ");
    // }

    kb.close();
  }
}
