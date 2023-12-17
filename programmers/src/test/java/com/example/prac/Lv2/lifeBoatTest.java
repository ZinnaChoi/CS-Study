package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class lifeBoatTest {

  @Test
  public void testSolution1() {
    lifeBoat lifeBoat = new lifeBoat();

    // Test Case 1
    int[] people1 = { 70, 50, 80, 50 };
    int limit1 = 100;
    int expected1 = 3;
    int result1 = lifeBoat.solution(people1, limit1);
    assertEquals(expected1, result1);

    // Test Case 2
    int[] people2 = { 70, 80, 50 };
    int limit2 = 100;
    int expected2 = 3;
    int result2 = lifeBoat.solution(people2, limit2);
    assertEquals(expected2, result2);
  }
}
