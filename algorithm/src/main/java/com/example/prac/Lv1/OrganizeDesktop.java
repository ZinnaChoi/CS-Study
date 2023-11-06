package com.example.prac.Lv1;

import java.util.*;

public class OrganizeDesktop {

  public int[] solution(String[] wallpaper) {
    List<Integer> rowList = new ArrayList<>();
    List<Integer> colList = new ArrayList<>();

    for (int row = 0; row < wallpaper.length; row++) {
      for (int col = 0; col < wallpaper[row].length(); col++) {
        if (wallpaper[row].charAt(col) == '#') {
          rowList.add(row);
          colList.add(col);
        }
      }
    }

    Collections.sort(rowList);
    Collections.sort(colList);

    int[] answer = {
      rowList.get(0),
      colList.get(0),
      rowList.get(rowList.size() - 1) + 1,
      colList.get(colList.size() - 1) + 1,
    };
    return answer;
  }
}
