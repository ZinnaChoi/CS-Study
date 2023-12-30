package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordTest {

  @Test
  void testSolution() {
    Password password = new Password();

    // 테스트 케이스 1
    String result1 = password.mySolution(
      10,
      "#*#*#**#***#*##*****##****###**#***#***#*##*#**#*#****#*#*****##***###"
    );
    assertEquals("TEACHERBAG", result1);

    // 테스트 케이스 2
    String result2 = password.mySolution(
      7,
      "#*#*#**#**#**##**##*##***#*##**#####*#*#*##*#*#**"
    );
    assertEquals("TIMEOUT", result2);
  }
}
