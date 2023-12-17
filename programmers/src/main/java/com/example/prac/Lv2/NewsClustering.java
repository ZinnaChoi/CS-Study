package com.example.prac.Lv2;

import java.util.*;

public class NewsClustering {

  public int solution(String str1, String str2) {
    List<String> s1List = makeStringSet(str1);
    List<String> s2List = makeStringSet(str2);

    if (s1List.isEmpty() && s2List.isEmpty()) {
      return 65536;
    }

    List<String> intersection = new ArrayList<>();
    List<String> union = new ArrayList<>(s2List);

    for (String element : s1List) {
      if (union.contains(element)) {
        union.remove(element);
        intersection.add(element);
      }
    }

    union.addAll(s1List);

    return (intersection.size() * 65536) / union.size();
  }

  private List<String> makeStringSet(String str) {
    List<String> stringSet = new ArrayList<>();

    for (int i = 0; i < str.length() - 1; i++) {
      String subset = str.substring(i, i + 2);

      if (subset.matches("[a-zA-Z]+")) {
        stringSet.add(subset.toUpperCase());
      }
    }
    return stringSet;
  }
}
