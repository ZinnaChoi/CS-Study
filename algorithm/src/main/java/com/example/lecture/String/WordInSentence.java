package com.example.lecture.String;

import java.util.*;

public class WordInSentence {

  public String mySolution(String sentence) {
    String[] words = sentence.split(" ");
    String longestWord = "";
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > longestWord.length()) longestWord = words[i];
    }
    return longestWord;
  }

  public String teacherSolution1(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE;

    String[] s = str.split(" ");
    for (String x : s) {
      int len = x.length();
      if (len > m) {
        m = len;
        answer = x;
      }
    }
    return answer;
  }

  public String teacherSolution2(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE, pos;

    while ((pos = str.indexOf(' ')) != -1) {
      String tmp = str.substring(0, pos);
      int len = tmp.length();
      if (len > m) { // 여기에 부등호 없어야 -> 가장 앞쪽에 위치한 긴 단어가 정답
        m = len;
        answer = tmp;
      }
      str = str.substring(pos + 1);
    }
    if (str.length() > m) answer = str; // 마지막 단어 처리
    return answer;
  }

  public static void main(String[] args) {
    WordInSentence T = new WordInSentence();
    Scanner kb = new Scanner(System.in);
    String sentence = kb.nextLine(); // 문장 입력받으므로 next() 아닌 nextLine()
    System.out.println(T.mySolution(sentence));
    // System.out.println(T.teacherSolution1(sentence));
    // System.out.println(T.teacherSolution2(sentence));
  }
}
