package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CalculateParkingFeeTest {

  @Test
  public void testSolution() {
    CalculateParkingFee calculateParkingFee = new CalculateParkingFee();

    // 테스트 케이스 1
    int[] fees1 = new int[] { 180, 5000, 10, 600 };
    String[] records1 = new String[] {
      "05:34 5961 IN",
      "06:00 0000 IN",
      "06:34 0000 OUT",
      "07:59 5961 OUT",
      "07:59 0148 IN",
      "18:59 0000 IN",
      "19:09 0148 OUT",
      "22:59 5961 IN",
      "23:00 5961 OUT",
    };
    int[] expected1 = new int[] { 14600, 34400, 5000 };
    assertArrayEquals(expected1, calculateParkingFee.solution(fees1, records1));

    // 테스트 케이스 2
    int[] fees2 = new int[] { 120, 0, 60, 591 };
    String[] records2 = new String[] {
      "16:00 3961 IN",
      "16:00 0202 IN",
      "18:00 3961 OUT",
      "18:00 0202 OUT",
      "23:58 3961 IN",
    };
    int[] expected2 = new int[] { 0, 591 };
    assertArrayEquals(expected2, calculateParkingFee.solution(fees2, records2));

    // 테스트 케이스 3
    int[] fees3 = new int[] { 1, 461, 1, 10 };
    String[] records3 = new String[] { "00:00 1234 IN" };
    int[] expected3 = new int[] { 14841 };
    assertArrayEquals(expected3, calculateParkingFee.solution(fees3, records3));
  }
}
