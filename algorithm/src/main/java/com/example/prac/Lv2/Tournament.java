package com.example.prac.Lv2;

public class Tournament {

  public int solution(int n, int a, int b) {
    int round = 1;

    while (true) {
      if (Math.abs(a - b) == 1 && (Math.min(a, b) % 2 == 1)) {
        break;
      }
      a = (a + 1) / 2;
      b = (b + 1) / 2;
      round++;
    }

    return round;
  }
}
