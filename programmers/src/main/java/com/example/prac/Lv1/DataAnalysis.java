package com.example.prac.Lv1;

import java.util.*;

public class DataAnalysis {

  public int[][] solution(
    int[][] data,
    String ext,
    int val_ext,
    String sort_by
  ) {
    Map<String, Integer> colOrder = new HashMap<>();
    colOrder.put("code", 0);
    colOrder.put("date", 1);
    colOrder.put("maximum", 2);
    colOrder.put("remain", 3);

    int[][] filteredData = Arrays
      .stream(data)
      .filter(x -> x[colOrder.get(ext)] < val_ext)
      .toArray(int[][]::new);
    Arrays.sort(
      filteredData,
      (o1, o2) -> o1[colOrder.get(sort_by)] - o2[colOrder.get(sort_by)]
    );

    return filteredData;
  }
}
