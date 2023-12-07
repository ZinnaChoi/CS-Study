package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TargetNumberTest {

  @Test
  public void testSolution() {
    TargetNumber targetNumber = new TargetNumber();

    int[] numbers1 = { 1, 1, 1, 1, 1 };
    int target1 = 3;
    int expected1 = 5;
    assertEquals(expected1, targetNumber.solution(numbers1, target1));

    int[] numbers2 = { 4, 1, 2, 1 };
    int target2 = 4;
    int expected2 = 2;
    assertEquals(expected2, targetNumber.solution(numbers2, target2));
  }
}
