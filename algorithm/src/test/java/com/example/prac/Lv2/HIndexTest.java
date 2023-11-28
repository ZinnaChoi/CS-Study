package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HIndexTest {

  @Test
  public void testSolution() {
    HIndex hIndex = new HIndex();

    // Test case 1
    int[] citations1 = { 3, 0, 6, 1, 5 };
    int result1 = hIndex.solution(citations1);
    assertEquals(3, result1);
  }
}
