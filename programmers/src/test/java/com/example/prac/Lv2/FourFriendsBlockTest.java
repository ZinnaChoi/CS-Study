package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FourFriendsBlockTest {

  @Test
  public void testSolution() {
    FourFreindsBlock fourFreindsBlock = new FourFreindsBlock();

    assertEquals(
      14,
      fourFreindsBlock.solution(
        4,
        5,
        new String[] { "CCBDE", "AAADE", "AAABF", "CCBBF" }
      )
    );
    assertEquals(
      15,
      fourFreindsBlock.solution(
        6,
        6,
        new String[] {
          "TTTANT",
          "RRFACC",
          "RRRFCC",
          "TRRRAA",
          "TTMMMF",
          "TMMTTJ",
        }
      )
    );
  }
}
