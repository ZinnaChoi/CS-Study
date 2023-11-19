package com.example.prac.Lv2;

public class JumpingSteps {

  public long solution(int n) {
    long[] jump = new long[2000];

    jump[0] = 1;
    jump[1] = 2;

    for (int i = 2; i < 2000; i++) {
      jump[i] = (jump[i - 1] + jump[i - 2]) % 1234567;
    }

    return jump[n - 1];
  }
}
