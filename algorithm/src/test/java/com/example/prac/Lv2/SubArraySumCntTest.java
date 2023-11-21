package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubArraySumCntTest {

  @Test
  public void testSolution() {
    SubArraySumCnt subArraySumCnt = new SubArraySumCnt();

    // Test Case 1
    int[] elements1 = { 7, 9, 1, 1, 4 };
    int result1 = subArraySumCnt.solution(elements1);
    assertEquals(18, result1);
  }
}
