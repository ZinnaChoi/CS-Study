package com.example.prac.Lv2;

public class RotateParentheses {

  public int solution(String s) {
    int answer = 0;
    for (int i = 0; i < s.length(); i++) {
      answer += isCorrect(s.substring(i) + s.substring(0, i));
    }
    return answer;
  }

  private int isCorrect(String s) {
    int cnt = s.length() / 2;
    while (s.length() > 0 && cnt > 0) {
      s = s.replace("[]", "").replace("{}", "").replace("()", "");
      cnt--;
    }
    return s.length() > 0 ? 0 : 1;
  }
}
