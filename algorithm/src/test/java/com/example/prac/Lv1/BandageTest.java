package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BandageTest {

  @Test
  public void testSolution() {
    Bandage bandageSolver = new Bandage();

    // Test Case 1
    int[] bandage1 = { 5, 1, 5 };
    int health1 = 30;
    int[][] attacks1 = { { 2, 10 }, { 9, 15 }, { 10, 5 }, { 11, 5 } };
    int result1 = bandageSolver.solution(bandage1, health1, attacks1);
    assertEquals(5, result1);

    // Test Case 2
    int[] bandage2 = { 3, 2, 7 };
    int health2 = 20;
    int[][] attacks2 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
    int result2 = bandageSolver.solution(bandage2, health2, attacks2);
    assertEquals(-1, result2);

    // Test Case 3
    int[] bandage3 = { 4, 2, 7 };
    int health3 = 20;
    int[][] attacks3 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
    int result3 = bandageSolver.solution(bandage3, health3, attacks3);
    assertEquals(-1, result3);

    // Test Case 4
    int[] bandage4 = { 1, 1, 1 };
    int health4 = 5;
    int[][] attacks4 = { { 1, 2 }, { 3, 2 } };
    int result4 = bandageSolver.solution(bandage4, health4, attacks4);
    assertEquals(3, result4);
  }
}
