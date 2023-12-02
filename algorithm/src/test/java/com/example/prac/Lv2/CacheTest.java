package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CacheTest {

  @Test
  public void testSolution() {
    Cache cache = new Cache();

    // Test Case 1
    assertEquals(
      50,
      cache.solution(
        3,
        new String[] {
          "Jeju",
          "Pangyo",
          "Seoul",
          "NewYork",
          "LA",
          "Jeju",
          "Pangyo",
          "Seoul",
          "NewYork",
          "LA",
        }
      )
    );

    // Test Case 2
    assertEquals(
      21,
      cache.solution(
        3,
        new String[] {
          "Jeju",
          "Pangyo",
          "Seoul",
          "Jeju",
          "Pangyo",
          "Seoul",
          "Jeju",
          "Pangyo",
          "Seoul",
        }
      )
    );

    // Test Case 3
    assertEquals(
      60,
      cache.solution(
        2,
        new String[] {
          "Jeju",
          "Pangyo",
          "Seoul",
          "NewYork",
          "LA",
          "SanFrancisco",
          "Seoul",
          "Rome",
          "Paris",
          "Jeju",
          "NewYork",
          "Rome",
        }
      )
    );

    // Test Case 4
    assertEquals(
      52,
      cache.solution(
        5,
        new String[] {
          "Jeju",
          "Pangyo",
          "Seoul",
          "NewYork",
          "LA",
          "SanFrancisco",
          "Seoul",
          "Rome",
          "Paris",
          "Jeju",
          "NewYork",
          "Rome",
        }
      )
    );

    // Test Case 5
    assertEquals(
      16,
      cache.solution(2, new String[] { "Jeju", "Pangyo", "NewYork", "newyork" })
    );

    // Test Case 6
    assertEquals(
      25,
      cache.solution(
        0,
        new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA" }
      )
    );
  }
}
