package com.example.prac.Lv2;

import java.util.*;

public class Clothes {

  public int solution(String[][] clothes) {
    int answer = 1;
    Map<String, Integer> typeCntMap = new HashMap<>();

    for (String[] c : clothes) {
      typeCntMap.put(c[1], typeCntMap.getOrDefault(c[1], 0) + 1);
    }

    for (String t : typeCntMap.keySet()) {
      answer *= typeCntMap.get(t) + 1;
    }

    return answer - 1;
  }
}
