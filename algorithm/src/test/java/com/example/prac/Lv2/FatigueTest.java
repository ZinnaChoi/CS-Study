package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FatigueTest {

  @Test
  public void testSolution() {
    Fatigue fatigue = new Fatigue();

    // Test Case 1
    int k1 = 80;
    int[][] dungeons1 = { { 80, 20 }, { 50, 40 }, { 30, 10 } };
    int result1 = fatigue.solution(k1, dungeons1);
    assertEquals(3, result1);
  }
}
