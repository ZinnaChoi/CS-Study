package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CarpetTest {

  @Test
  public void testSolution() {
    Carpet carpet = new Carpet();

    // Test case 1
    int[] result1 = carpet.solution(10, 2);
    assertArrayEquals(new int[] { 4, 3 }, result1);

    // Test case 2
    int[] result2 = carpet.solution(8, 1);
    assertArrayEquals(new int[] { 3, 3 }, result2);

    // Test case 3
    int[] result3 = carpet.solution(24, 24);
    assertArrayEquals(new int[] { 8, 6 }, result3);
  }
}
