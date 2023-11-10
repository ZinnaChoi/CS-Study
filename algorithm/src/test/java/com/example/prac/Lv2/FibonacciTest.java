package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

  @Test
  public void testSolution() {
    Fibonacci fibonacci = new Fibonacci();

    // Test case 1
    int result1 = fibonacci.solution(3);
    assertEquals(2, result1);

    // Test case 2
    int result2 = fibonacci.solution(5);
    assertEquals(5, result2);

    // Additional test case
    int result3 = fibonacci.solution(10);
    assertEquals(55, result3);
  }
}
