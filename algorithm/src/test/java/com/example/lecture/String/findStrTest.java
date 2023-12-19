package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class findStrTest {

  @Test
  public void testSolution() {
    FindStr findStr = new FindStr();

    String testStr = "Computercooler";
    char testChar = 'c';
    int expectedCnt = 2;

    int actualCnt = findStr.mySolution(testStr, testChar);

    assertEquals(expectedCnt, actualCnt);
  }
}
