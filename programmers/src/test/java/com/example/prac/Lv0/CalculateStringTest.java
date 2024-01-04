package com.example.prac.Lv0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateStringTest {

  @Test
  public void testSolution() {
    CalculateString calculateString = new CalculateString();

    // Test case 1
    int result1 = calculateString.solution("3 + 4");
    assertEquals(7, result1, "The result of '3 + 4' should be 7");

    // Test case 2
    int result2 = calculateString.solution("3 - 2");
    assertEquals(1, result2, "The result of '3 - 2' should be 1");

    // Test case 3
    int result3 = calculateString.solution("1 + 2 + 3 - 4");
    assertEquals(2, result3, "The result of '1 + 2 + 3 - 4' should be 2");
  }
}
