package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NextBigNumberTest {

  @Test
  public void testSolution() {
    NextBigNumber nextBigNumber = new NextBigNumber();

    assertEquals(83, nextBigNumber.solution(78));
    assertEquals(23, nextBigNumber.solution(15));
    // Add more test cases if needed
  }
}
