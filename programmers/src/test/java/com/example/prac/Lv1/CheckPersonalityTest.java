package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckPersonalityTest {

  @Test
  public void testSolution() {
    CheckPersonality checker = new CheckPersonality();

    // Test case 1
    String[] survey1 = { "AN", "CF", "MJ", "RT", "NA" };
    int[] choices1 = { 5, 3, 2, 7, 5 };
    String result1 = checker.solution(survey1, choices1);
    assertEquals("TCMA", result1);

    // Test case 2
    String[] survey2 = { "TR", "RT", "TR" };
    int[] choices2 = { 7, 1, 3 };
    String result2 = checker.solution(survey2, choices2);
    assertEquals("RCJA", result2);
  }
}
