package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VowelDictionaryTest {

  @Test
  public void testSolution() {
    VowelDictionary vowelDictionary = new VowelDictionary();

    assertEquals(6, vowelDictionary.solution("AAAAE"));
    assertEquals(10, vowelDictionary.solution("AAAE"));
    assertEquals(1563, vowelDictionary.solution("I"));
    assertEquals(1189, vowelDictionary.solution("EIO"));
  }
}
