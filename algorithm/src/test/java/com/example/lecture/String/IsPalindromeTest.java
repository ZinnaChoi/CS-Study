package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsPalindromeTest {

  @Test
  public void testSolution() {
    IsPalindrome isPalindrome = new IsPalindrome();
    assertEquals("YES", isPalindrome.mySolution("gooG"));

    assertEquals(
      "NO",
      isPalindrome.mySolution(
        "kstudkgksjlkgjlksjdggkkllllllllllllllllllllllsjgksjldgjlllllllllllllllgjks"
      )
    );
  }
}
