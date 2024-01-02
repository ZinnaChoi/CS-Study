package com.example.prac.Lv2;

import java.util.Stack;

public class BoxCount {

  public int solution(int[] order) {
    int boxCnt = 0;
    int[] belt = new int[order.length];
    Stack<Integer> assist = new Stack<>();

    for (int i = 0; i < order.length; i++) {
      belt[order[i] - 1] = i + 1;
    }

    int beltIndex = 1;
    for (int i = 0; i < belt.length; i++) {
      while (!assist.isEmpty() && assist.peek() == beltIndex) {
        assist.pop();
        boxCnt++;
        beltIndex++;
      }

      if (belt[i] == beltIndex) {
        beltIndex++;
        boxCnt++;
      } else {
        assist.push(belt[i]);
      }
    }

    while (!assist.isEmpty() && assist.peek() == beltIndex) {
      assist.pop();
      boxCnt++;
      beltIndex++;
    }

    return boxCnt;
  }
}
