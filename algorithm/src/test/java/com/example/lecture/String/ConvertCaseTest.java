package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertCaseTest {

  @Test
  public void testSolution() {
    ConvertCase convertCase = new ConvertCase();

    String input = "StuDY";
    String expectedOutput = "sTUdy";

    String actualOutput = convertCase.mySolution(input);
    assertEquals(expectedOutput, actualOutput);
  }
}
