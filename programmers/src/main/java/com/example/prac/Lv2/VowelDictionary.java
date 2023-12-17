package com.example.prac.Lv2;

import java.util.*;

public class VowelDictionary {

  static char[] currentWord;

  public int solution(String word) {
    List<String> wordList = new ArrayList<>();

    currentWord = new char[5];
    DFS(0, wordList);

    Collections.sort(wordList);

    int idx = 1;
    for (String w : wordList) {
      if (w.equals(word)) return idx;
      idx++;
    }
    return idx;
  }

  private void DFS(int L, List<String> lst) {
    char[] alphabet = { 'A', 'E', 'I', 'O', 'U' };

    if (L > 0) {
      lst.add(new String(currentWord, 0, L));
    }

    if (L == 5) {
      return;
    }

    for (char letter : alphabet) {
      currentWord[L] = letter;
      DFS(L + 1, lst);
    }
  }
}
