package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SliceArrayTest {

  @Test
  public void testSolution() {
    SliceArray sliceArray = new SliceArray();

    // Test Case 1
    int[] result1 = sliceArray.solution(3, 2, 5);
    int[] expected1 = { 3, 2, 2, 3 };
    assertArrayEquals(expected1, result1);

    // Test Case 2
    int[] result2 = sliceArray.solution(4, 7, 14);
    int[] expected2 = { 4, 3, 3, 3, 4, 4, 4, 4 };
    assertArrayEquals(expected2, result2);
  }
}
