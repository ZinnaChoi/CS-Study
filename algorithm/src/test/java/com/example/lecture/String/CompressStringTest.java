package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

  @Test
  public void testSolution() {
    CompressString compressString = new CompressString();

    // 첫 번째 테스트 케이스
    String input1 = "KDKGKKSKKFJKKKKSLSSSSKFKSSSS";
    String expectedOutput1 = "KDKGK2SK2FJK4SLS4KFKS4";
    String actualOutput1 = compressString.mySolution(input1);
    assertEquals(expectedOutput1, actualOutput1);

    // 두 번째 테스트 케이스
    String input2 = "KKKKTTTUUUKDDDDDKDDDKKSKKFJKYYYKUYY";
    String expectedOutput2 = "K4T3U3KD5KD3K2SK2FJKY3KUY2";
    String actualOutput2 = compressString.mySolution(input2);
    assertEquals(expectedOutput2, actualOutput2);
  }
}
