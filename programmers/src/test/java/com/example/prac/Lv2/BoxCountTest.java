package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoxCountTest {

  @Test
  public void testSolution() {
    BoxCount boxCount = new BoxCount();

    // 테스트 케이스 1
    int[] order1 = { 4, 3, 1, 2, 5 };
    int expected1 = 2;
    assertEquals(expected1, boxCount.solution(order1));

    // 테스트 케이스 2
    int[] order2 = { 5, 4, 3, 2, 1 };
    int expected2 = 5;
    assertEquals(expected2, boxCount.solution(order2));
  }
}
