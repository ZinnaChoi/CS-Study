package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ShortestWordDistanceTest {

  @Test
  public void testMySolution() {
    ShortestWordDistance shortestWordDistance = new ShortestWordDistance(); // 클래스 이름에 맞게 수정하세요

    // 첫 번째 테스트 케이스
    String input1 = "fkdgkjdflkgjljslgjkfldjlkfdg";
    char ch1 = 'f';
    int[] expected1 = {
      0,
      1,
      2,
      3,
      3,
      2,
      1,
      0,
      1,
      2,
      3,
      4,
      5,
      6,
      5,
      4,
      3,
      2,
      1,
      0,
      1,
      2,
      3,
      2,
      1,
      0,
      1,
      2,
    };
    int[] actual1 = shortestWordDistance.mySolution(input1, ch1);
    assertArrayEquals(expected1, actual1);

    // 두 번째 테스트 케이스
    String input2 = "timeout";
    char ch2 = 't';
    int[] expected2 = { 0, 1, 2, 3, 2, 1, 0 };
    int[] actual2 = shortestWordDistance.mySolution(input2, ch2);
    assertArrayEquals(expected2, actual2);
  }
}
