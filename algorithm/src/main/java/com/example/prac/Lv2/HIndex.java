package com.example.prac.Lv2;

public class HIndex {

  public int solution(int[] citations) {
    for (int i = citations.length; i >= 0; i--) {
      int cnt = 0;
      for (int c : citations) {
        if (c >= i) cnt++;
      }
      if (cnt >= i && citations.length - cnt <= i) return i;
    }
    return 0;
  }
}
