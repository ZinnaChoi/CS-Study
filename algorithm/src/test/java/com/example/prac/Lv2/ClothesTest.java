package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClothesTest {

  @Test
  public void testSolution() {
    Clothes clothes = new Clothes();
    String[][] clothes1 = {
      { "yellow_hat", "headgear" },
      { "blue_sunglasses", "eyewear" },
      { "green_turban", "headgear" },
    };
    int expected1 = 5;
    int result1 = clothes.solution(clothes1);
    assertEquals(expected1, result1);

    String[][] clothes2 = {
      { "crow_mask", "face" },
      { "blue_sunglasses", "face" },
      { "smoky_makeup", "face" },
    };
    int expected2 = 3;
    int result2 = clothes.solution(clothes2);
    assertEquals(expected2, result2);
  }
}
