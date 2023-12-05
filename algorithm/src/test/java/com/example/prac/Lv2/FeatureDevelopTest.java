package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FeatureDevelopTest {

  @Test
  public void testSolution() {
    FeatureDevelop featureDevelop = new FeatureDevelop();

    // Test Case 1
    int[] progresses1 = { 93, 30, 55 };
    int[] speeds1 = { 1, 30, 5 };
    int[] expected1 = { 2, 1 };
    int[] result1 = featureDevelop.solution(progresses1, speeds1);
    assertArrayEquals(expected1, result1, "Test Case 1 Failed");

    // Test Case 2
    int[] progresses2 = { 95, 90, 99, 99, 80, 99 };
    int[] speeds2 = { 1, 1, 1, 1, 1, 1 };
    int[] expected2 = { 1, 3, 2 };
    int[] result2 = featureDevelop.solution(progresses2, speeds2);
    assertArrayEquals(expected2, result2, "Test Case 2 Failed");
  }
}
