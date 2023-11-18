package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCMOfMultipleNumbersTest {

  @Test
  public void testSolution() {
    LCMOfMultipleNumbers lcmOfMultipleNumbers = new LCMOfMultipleNumbers();

    // Test Case 1
    int[] arr1 = { 2, 6, 8, 14 };
    int result1 = lcmOfMultipleNumbers.solution(arr1);
    assertEquals(168, result1);

    // Test Case 2
    int[] arr2 = { 1, 2, 3 };
    int result2 = lcmOfMultipleNumbers.solution(arr2);
    assertEquals(6, result2);
  }
}
