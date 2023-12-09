package com.example.prac.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Process {

  public int solution(int[] priorities, int location) {
    Queue<int[]> queue = new LinkedList<>();

    // order, priority pair
    for (int i = 0; i < priorities.length; i++) {
      queue.add(new int[] { i, priorities[i] });
    }

    int idx = 0;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      boolean bigger = queue.stream().anyMatch(q -> current[1] < q[1]);

      if (bigger) {
        queue.add(current);
      } else {
        idx++;
        if (current[0] == location) {
          break;
        }
      }
    }
    return idx;
  }
}
