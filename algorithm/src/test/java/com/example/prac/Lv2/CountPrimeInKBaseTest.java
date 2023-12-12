package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountPrimeInKBaseTest {

  private final CountPrimeInKBase countPrimeInKBase = new CountPrimeInKBase();

  @Test
  public void testSolution() {
    assertEquals(
      3,
      countPrimeInKBase.solution(437674, 3),
      "Test failed for input: 437674 in base 3"
    );
    assertEquals(
      2,
      countPrimeInKBase.solution(110011, 10),
      "Test failed for input: 110011 in base 10"
    );
  }
}
