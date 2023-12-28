package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExtractNumTest {

  @Test
  public void testSolution() {
    ExtractNum extractNum = new ExtractNum(); // 클래스 이름에 맞게 수정하세요

    // 테스트 케이스 1
    String input1 = "g0en2T0s8eSoft";
    int expected1 = 208;
    int actual1 = extractNum.mySolution(input1);

    assertEquals(expected1, actual1);

    // 테스트 케이스 2
    String input2 = "Akdj0Gk1djADG2SDGkdj0f";
    int expected2 = 120;
    int actual2 = extractNum.mySolution(input2);

    assertEquals(expected2, actual2);
  }
}
