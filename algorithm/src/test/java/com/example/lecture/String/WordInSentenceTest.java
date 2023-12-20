package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WordInSentenceTest {

  @Test
  public void testSolution() {
    WordInSentence wordInSentence = new WordInSentence();

    // 테스트 케이스 1
    String sentence1 = "it is time to study";
    String expected1 = "study";
    assertEquals(expected1, wordInSentence.mySolution(sentence1));
  }
}
