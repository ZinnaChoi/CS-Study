package com.example.prac.Lv2;

import java.util.*;

public class EnglishWordChain {

  public int[] solution(int n, String[] words) {
    String end = "";
    Set<String> wordsSet = new HashSet<>();

    int idx = 0;
    Boolean find = false;
    for (String w : words) {
      if (!w.startsWith(end) || wordsSet.contains(w)) {
        find = true;
        break;
      }
      end = w.substring(w.length() - 1);
      wordsSet.add(w);
      idx++;
    }

    int[] answer = { 0, 0 };
    if (!find) return answer;

    int num = (idx % n) + 1;
    int order = (idx / n) + 1;

    return new int[] { num, order };
  }
}
