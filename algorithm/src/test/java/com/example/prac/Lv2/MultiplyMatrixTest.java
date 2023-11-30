package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MultiplyMatrixTest {

  @Test
  public void testSolution() {
    MultiplyMatrix multiplyMatrix = new MultiplyMatrix();

    int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
    int[][] arr2 = { { 3, 3 }, { 3, 3 } };
    int[][] expected1 = { { 15, 15 }, { 15, 15 }, { 15, 15 } };
    assertArrayEquals(expected1, multiplyMatrix.solution(arr1, arr2));

    int[][] arr3 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
    int[][] arr4 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };
    int[][] expected2 = { { 22, 22, 11 }, { 36, 28, 18 }, { 29, 20, 14 } };
    assertArrayEquals(expected2, multiplyMatrix.solution(arr3, arr4));
  }
}
