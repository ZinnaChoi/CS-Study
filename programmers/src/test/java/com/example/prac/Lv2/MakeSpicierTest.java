package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakeSpicierTest {

  @Test
  public void testSolution() {
    MakeSpicier makeSpicier = new MakeSpicier();

    // 테스트 케이스 1
    int[] scoville1 = { 1, 2, 3, 9, 10, 12 };
    int K1 = 7;
    int expected1 = 2;
    assertEquals(expected1, makeSpicier.solution(scoville1, K1));
  }
}
