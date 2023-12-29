package com.example.prac.Lv2;

import java.util.*;

public class SliceRollCake {

  public int solution(int[] topping) {
    int fairCnt = 0;
    Set<Integer> frontSet = new HashSet<>();
    Set<Integer> backSet = new HashSet<>();

    for (int t : topping) {
      backSet.add(t);
    }

    for (int i = 0; i < topping.length - 1; i++) {
      frontSet.add(topping[i]);

      boolean exist = false;
      for (int j = i + 1; j < topping.length; j++) {
        if (topping[j] == topping[i]) {
          exist = true;
          break;
        }
      }
      if (!exist) backSet.remove(topping[i]);
      if (frontSet.size() == backSet.size()) {
        fairCnt++;
      }
    }
    return fairCnt;
  }
}
