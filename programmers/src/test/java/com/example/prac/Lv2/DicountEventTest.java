package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DicountEventTest {

  @Test
  public void testSolution() {
    DiscountEvent discountEvent = new DiscountEvent();

    // Test Case 1
    String[] want1 = { "banana", "apple", "rice", "pork", "pot" };
    int[] number1 = { 3, 2, 2, 2, 1 };
    String[] discount1 = {
      "chicken",
      "apple",
      "apple",
      "banana",
      "rice",
      "apple",
      "pork",
      "banana",
      "pork",
      "rice",
      "pot",
      "banana",
      "apple",
      "banana",
    };
    int result1 = discountEvent.solution(want1, number1, discount1);
    assertEquals(3, result1);

    // Test Case 2
    String[] want2 = { "apple" };
    int[] number2 = { 10 };
    String[] discount2 = {
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
      "banana",
    };
    int result2 = discountEvent.solution(want2, number2, discount2);
    assertEquals(0, result2);
  }
}
