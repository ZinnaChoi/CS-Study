package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class StockPriceTest {

  @Test
  public void testSolution() {
    StockPrice stockPrice = new StockPrice();

    // 테스트 케이스 1
    int[] prices1 = { 1, 2, 3, 2, 3 };
    int[] expected1 = { 4, 3, 1, 1, 0 };
    assertArrayEquals(expected1, stockPrice.solution(prices1));
  }
}
