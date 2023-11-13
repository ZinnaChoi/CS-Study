package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class EnglishWordChainTest {

  @Test
  public void testSolution() {
    EnglishWordChain englishWordChain = new EnglishWordChain();
    int n1 = 3;
    String[] words1 = {
      "tank",
      "kick",
      "know",
      "wheel",
      "land",
      "dream",
      "mother",
      "robot",
      "tank",
    };
    int[] expected1 = { 3, 3 };
    int[] result1 = englishWordChain.solution(n1, words1);
    assertArrayEquals(expected1, result1);

    int n2 = 5;
    String[] words2 = {
      "hello",
      "observe",
      "effect",
      "take",
      "either",
      "recognize",
      "encourage",
      "ensure",
      "establish",
      "hang",
      "gather",
      "refer",
      "reference",
      "estimate",
      "executive",
    };
    int[] expected2 = { 0, 0 };
    int[] result2 = englishWordChain.solution(n2, words2);
    assertArrayEquals(expected2, result2);

    int n3 = 2;
    String[] words3 = {
      "hello",
      "one",
      "even",
      "never",
      "now",
      "world",
      "draw",
    };
    int[] expected3 = { 1, 3 };
    int[] result3 = englishWordChain.solution(n3, words3);
    assertArrayEquals(expected3, result3);
  }
}
