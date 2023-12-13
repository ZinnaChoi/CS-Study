package com.example.prac.Lv2;

import java.util.*;

public class LZWCompression {

  public int[] solution(String msg) {
    List<Integer> answerList = new ArrayList<>();
    Map<String, Integer> wordNumMap = new HashMap<>();

    for (int i = 65; i < 91; i++) {
      wordNumMap.put(String.valueOf((char) i), i - 64);
    }

    int newIndex = 27;
    int idx = 0;

    while (idx < msg.length()) {
      String w = "";
      for (int i = 1; i <= msg.length() - idx; i++) {
        String current = msg.substring(idx, idx + i);
        if (wordNumMap.containsKey(current)) {
          w = current;
        } else {
          wordNumMap.put(current, newIndex++);
          break;
        }
      }

      answerList.add(wordNumMap.get(w));
      idx += w.length();
    }

    return answerList.stream().mapToInt(Integer::intValue).toArray();
  }
}
