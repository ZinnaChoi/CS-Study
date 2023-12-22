package com.example.prac.Lv2;

import java.util.HashSet;
import java.util.Set;

public class VisitedLength {

  private static final int MIN_COORD = -5;
  private static final int MAX_COORD = 5;

  public int solution(String dirs) {
    Set<String> paths = new HashSet<>();
    int x = 0, y = 0;

    for (char d : dirs.toCharArray()) {
      int newX = x, newY = y;

      if (d == 'L' && x > MIN_COORD) newX--; else if (
        d == 'R' && x < MAX_COORD
      ) newX++; else if (d == 'U' && y < MAX_COORD) newY++; else if (
        d == 'D' && y > MIN_COORD
      ) newY--;

      if (newX != x || newY != y) {
        String path = createPath(x, y, newX, newY);
        paths.add(path);
        x = newX;
        y = newY;
      }
    }

    return paths.size();
  }

  private String createPath(int x1, int y1, int x2, int y2) {
    if (x1 > x2 || (x1 == x2 && y1 > y2)) {
      return x2 + "," + y2 + "->" + x1 + "," + y1;
    } else {
      return x1 + "," + y1 + "->" + x2 + "," + y2;
    }
  }
}
