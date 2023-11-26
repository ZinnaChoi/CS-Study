package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DataAnalysisTest {

  @Test
  public void testSolution() {
    int[][] inputData = {
      { 1, 20300104, 100, 80 },
      { 2, 20300804, 847, 37 },
      { 3, 20300401, 10, 8 },
    };

    DataAnalysis dataAnalysis = new DataAnalysis();

    String ext = "date";
    int val_ext = 20300501;
    String sort_by = "remain";

    int[][] expectedResult = {
      { 3, 20300401, 10, 8 },
      { 1, 20300104, 100, 80 },
    };

    int[][] result = dataAnalysis.solution(inputData, ext, val_ext, sort_by);

    assertArrayEquals(expectedResult, result);
  }
}
