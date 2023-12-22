package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VisitedLengthTest {

  @Test
  public void testSolution() {
    VisitedLength visitedLength = new VisitedLength();

    assertEquals(7, visitedLength.solution("ULURRDLLU"));
    assertEquals(7, visitedLength.solution("LULLLLLLU"));
  }
}
