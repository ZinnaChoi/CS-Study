package com.example.prac.Lv2;

import java.util.*;

public class DiscountEvent {

  public int solution(String[] want, int[] number, String[] discount) {
    int answer = 0;
    for (int i = 0; i < discount.length - 9; i++) {
      String[] subList = Arrays.copyOfRange(discount, i, i + 10);
      if (goodToRgst(subList, want, number)) answer++;
    }
    return answer;
  }

  private boolean goodToRgst(String[] subList, String[] want, int[] number) {
    boolean good = true;
    for (int i = 0; i < number.length; i++) {
      int cnt = 0;
      for (int j = 0; j < 10; j++) {
        if (subList[j].equals(want[i])) {
          cnt++;
        }
      }
      if (cnt != number[i]) {
        good = false;
        break;
      }
    }
    return good;
  }
}
