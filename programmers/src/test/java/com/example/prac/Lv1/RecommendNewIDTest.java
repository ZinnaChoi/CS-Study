package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecommendNewIDTest {

  @Test
  public void testSolution() {
    RecommendNewID recommendNewID = new RecommendNewID();

    // Test Case 1
    String input1 = "...!@BaT#*..y.abcdefghijklm";
    String expected1 = "bat.y.abcdefghi";
    assertEquals(expected1, recommendNewID.solution(input1));

    // Test Case 2
    String input2 = "z-+.^.";
    String expected2 = "z--";
    assertEquals(expected2, recommendNewID.solution(input2));

    // Test Case 3
    String input3 = "=.=";
    String expected3 = "aaa";
    assertEquals(expected3, recommendNewID.solution(input3));

    // Test Case 4
    String input4 = "123_.def";
    String expected4 = "123_.def";
    assertEquals(expected4, recommendNewID.solution(input4));

    // Test Case 5
    String input5 = "abcdefghijklmn.p";
    String expected5 = "abcdefghijklmn";
    assertEquals(expected5, recommendNewID.solution(input5));
  }
}
