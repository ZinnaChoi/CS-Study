package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SelectTangerinesTest {

  @Test
  public void testSolution() {
    SelectTangerines selectTangerines = new SelectTangerines();

    // Test Case 1
    int[] tangerines1 = { 1, 3, 2, 5, 4, 5, 2, 3 };
    int k1 = 6;
    int expected1 = 3;
    int result1 = selectTangerines.solution(k1, tangerines1);
    assertEquals(expected1, result1);

    // Test Case 2
    int[] tangerines2 = { 1, 3, 2, 5, 4, 5, 2, 3 };
    int k2 = 4;
    int expected2 = 2;
    int result2 = selectTangerines.solution(k2, tangerines2);
    assertEquals(expected2, result2);

    // Test Case 3
    int[] tangerines3 = { 1, 1, 1, 1, 2, 2, 2, 3 };
    int k3 = 2;
    int expected3 = 1;
    int result3 = selectTangerines.solution(k3, tangerines3);
    assertEquals(expected3, result3);
  }
}
