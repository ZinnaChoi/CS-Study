package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NeighborCellTest {

  @Test
  public void testSolution() {
    NeighborCell neighborCell = new NeighborCell();

    // Test Case 1
    String[][] board1 = {
      { "blue", "red", "orange", "red" },
      { "red", "red", "blue", "orange" },
      { "blue", "orange", "red", "red" },
      { "orange", "orange", "red", "blue" },
    };
    int h1 = 1;
    int w1 = 1;
    int result1 = neighborCell.solution(board1, h1, w1);
    assertEquals(2, result1);

    // Test Case 2
    String[][] board2 = {
      { "yellow", "green", "blue" },
      { "blue", "green", "yellow" },
      { "yellow", "blue", "blue" },
    };
    int h2 = 0;
    int w2 = 1;
    int result2 = neighborCell.solution(board2, h2, w2);
    assertEquals(1, result2);
  }
}
