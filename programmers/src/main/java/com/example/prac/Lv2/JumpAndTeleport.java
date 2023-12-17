package com.example.prac.Lv2;

public class JumpAndTeleport {

  public int solution(int n) {
    int cnt = 1;
    while (n > 1) {
      if (n % 2 == 1) cnt++;
      n = n / 2;
    }

    return cnt;
  }
}
