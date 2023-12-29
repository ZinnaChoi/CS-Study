package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SliceRollCakeTest {

  @Test
  public void testSolution() {
    SliceRollCake sliceRollCake = new SliceRollCake();

    assertEquals(
      2,
      sliceRollCake.solution(new int[] { 1, 2, 1, 3, 1, 4, 1, 2 })
    );
    assertEquals(0, sliceRollCake.solution(new int[] { 1, 2, 3, 1, 4 }));
  }
}
