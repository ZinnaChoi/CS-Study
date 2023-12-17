package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveInPairTest {

  @Test
  public void testSolution() {
    RemoveInPair removeInPair = new RemoveInPair();

    // Test Case 1
    String s1 = "baabaa";
    int result1 = removeInPair.solution(s1);
    assertEquals(1, result1);

    // Test Case 2
    String s2 = "cdcd";
    int result2 = removeInPair.solution(s2);
    assertEquals(0, result2);

    // Test Case 3 (empty string)
    String s3 = "";
    int result3 = removeInPair.solution(s3);
    assertEquals(1, result3);

    // Test Case 4 (single character)
    String s4 = "a";
    int result4 = removeInPair.solution(s4);
    assertEquals(0, result4);
  }
}
