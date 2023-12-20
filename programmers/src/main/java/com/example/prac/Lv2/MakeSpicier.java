package com.example.prac.Lv2;

import java.util.PriorityQueue;

public class MakeSpicier {

  public int solution(int[] scoville, int K) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for (int s : scoville) {
      q.add(s);
    }
    int mixCnt = 0;
    while (q.size() >= 2 && q.peek() < K) {
      q.add(q.poll() + q.poll() * 2);
      mixCnt++;
    }
    if (q.peek() < K) return -1;

    return mixCnt;
  }
}
