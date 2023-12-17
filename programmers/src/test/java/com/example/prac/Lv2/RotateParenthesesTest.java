package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RotateParenthesesTest {

  @Test
  public void testSolution() {
    RotateParentheses rotateParentheses = new RotateParentheses();

    assertEquals(3, rotateParentheses.solution("[](){}"));
    assertEquals(2, rotateParentheses.solution("}]()[{"));
    assertEquals(0, rotateParentheses.solution("[)(]"));
    assertEquals(0, rotateParentheses.solution("}}}}"));
  }
}
