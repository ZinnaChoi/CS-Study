package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

  @Test
  public void testSolution() {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertEquals("NO", validPalindrome.mySolution("kdjg$@kjkldjkg%@dkjgkj"));

    assertEquals(
      "YES",
      validPalindrome.mySolution("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a")
    );
  }
}
