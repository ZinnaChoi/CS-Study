package com.example.prac.Lv2;

import java.util.*;

public class SelectTangerines {

  public int solution(int k, int[] tangerine) {
    Map<Integer, Integer> cntMap = new HashMap<>();

    for (int t : tangerine) {
      cntMap.put(t, cntMap.getOrDefault(t, 0) + 1);
    }

    Integer[] sortedTangerine = Arrays
      .stream(tangerine)
      .boxed()
      .sorted(
        Comparator
          .<Integer, Integer>comparing(cntMap::get)
          .reversed()
          .thenComparingInt(i -> i)
      )
      .toArray(Integer[]::new);

    return (int) Arrays.stream(sortedTangerine).limit(k).distinct().count();
  }
}
