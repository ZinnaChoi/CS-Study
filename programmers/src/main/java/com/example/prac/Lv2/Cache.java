package com.example.prac.Lv2;

import java.util.*;

public class Cache {

  private static final int HIT_TIME = 1;
  private static final int MISS_TIME = 5;

  public int solution(int cacheSize, String[] cities) {
    Queue<String> q = new LinkedList<>();
    int time = 0;

    for (String c : cities) {
      String city = c.toLowerCase();
      if (q.contains(city)) {
        q.remove(city);
        q.add(city);
        time += HIT_TIME;
      } else {
        q.add(city);
        if (q.size() > cacheSize) {
          q.poll();
        }
        time += MISS_TIME;
      }
    }
    return time;
  }
}
