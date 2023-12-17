package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TupleTest {

  @Test
  public void testSolution() {
    Tuple tuple = new Tuple();

    assertArrayEquals(
      new int[] { 2, 1, 3, 4 },
      tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")
    );
    assertArrayEquals(
      new int[] { 2, 1, 3, 4 },
      tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")
    );
    assertArrayEquals(
      new int[] { 111, 20 },
      tuple.solution("{{20,111},{111}}")
    );
    assertArrayEquals(new int[] { 123 }, tuple.solution("{{123}}"));
    assertArrayEquals(
      new int[] { 3, 2, 4, 1 },
      tuple.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")
    );
  }
}
