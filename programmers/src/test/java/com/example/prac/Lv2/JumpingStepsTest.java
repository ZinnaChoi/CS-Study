package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpingStepsTest {

  @Test
  void testSolution() {
    JumpingSteps jumpingSteps = new JumpingSteps();

    // Test case 1
    int n1 = 4;
    long expected1 = 5;
    long result1 = jumpingSteps.solution(n1);
    assertEquals(expected1, result1);

    // Test case 2
    int n2 = 3;
    long expected2 = 3;
    long result2 = jumpingSteps.solution(n2);
    assertEquals(expected2, result2);
  }
}
