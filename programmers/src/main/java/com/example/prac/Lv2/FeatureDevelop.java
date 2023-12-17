package com.example.prac.Lv2;

import java.util.*;

public class FeatureDevelop {

  public int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> workDays = new LinkedList<>();
    List<Integer> answerList = new ArrayList<>();

    for (int i = 0; i < speeds.length; i++) {
      int extraDay = ((100 - progresses[i]) % speeds[i] == 0) ? 0 : 1;
      workDays.add((100 - progresses[i]) / speeds[i] + extraDay);
    }

    int cnt = 0;
    int num = workDays.peek();
    while (!workDays.isEmpty()) {
      if (num < workDays.peek()) {
        num = workDays.peek();
        answerList.add(cnt);
        cnt = 1;
      } else {
        cnt++;
      }
      workDays.poll();
      if (workDays.isEmpty()) {
        answerList.add(cnt);
      }
    }

    int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
    return answer;
  }
}
