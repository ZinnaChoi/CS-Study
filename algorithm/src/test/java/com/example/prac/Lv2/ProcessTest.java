package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProcessTest {

  @Test
  public void testSolution() {
    Process process = new Process();
    int[] priorities1 = { 2, 1, 3, 2 };
    int location1 = 2;
    int expected1 = 1;
    int result1 = process.solution(priorities1, location1);
    assertEquals(expected1, result1);

    int[] priorities2 = { 1, 1, 9, 1, 1, 1 };
    int location2 = 0;
    int expected2 = 5;
    int result2 = process.solution(priorities2, location2);
    assertEquals(expected2, result2);
  }
}
