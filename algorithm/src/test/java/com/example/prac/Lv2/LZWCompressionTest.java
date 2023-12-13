package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LZWCompressionTest {

  @Test
  public void testSolution() {
    LZWCompression lzw = new LZWCompression();
    int[] expected1 = new int[] { 11, 1, 27, 15 };
    int[] actual1 = lzw.solution("KAKAO");
    assertArrayEquals(expected1, actual1, "KAKAO test failed");

    int[] expected2 = new int[] {
      20,
      15,
      2,
      5,
      15,
      18,
      14,
      15,
      20,
      27,
      29,
      31,
      36,
      30,
      32,
      34,
    };
    int[] actual2 = lzw.solution("TOBEORNOTTOBEORTOBEORNOT");
    assertArrayEquals(
      expected2,
      actual2,
      "TOBEORNOTTOBEORTOBEORNOT test failed"
    );

    int[] expected3 = new int[] { 1, 2, 27, 29, 28, 31, 30 };
    int[] actual3 = lzw.solution("ABABABABABABABAB");
    assertArrayEquals(expected3, actual3, "ABABABABABABABAB test failed");
  }
}
