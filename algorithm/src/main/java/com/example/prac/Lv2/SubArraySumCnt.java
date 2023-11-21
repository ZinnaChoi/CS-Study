package com.example.prac.Lv2;

import java.util.*;

public class SubArraySumCnt {

  public int solution(int[] elements) {
    Set<Integer> numSet = new HashSet<>();

    for (int j = 0; j < elements.length; j++) {
      int sum = 0;
      for (int i = 0; i < elements.length; i++) {
        sum += elements[(i + j) % elements.length];
        numSet.add(sum);
      }
    }
    return numSet.size();
  }
}
