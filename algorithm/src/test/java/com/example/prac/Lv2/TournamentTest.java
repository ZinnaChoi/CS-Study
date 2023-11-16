package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TournamentTest {

  @Test
  public void testSolution() {
    Tournament tournament = new Tournament();

    // Test Case 1
    int result1 = tournament.solution(8, 4, 7);
    assertEquals(3, result1);
  }
}
