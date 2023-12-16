package com.example.prac;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.prac.Lv2.NBaseNumberGame;
import org.junit.jupiter.api.Test;

public class NBaseNumberGameTest {

  @Test
  public void testSolution() {
    NBaseNumberGame game = new NBaseNumberGame();

    // 첫 번째 테스트 케이스
    assertEquals("0111", game.solution(2, 4, 2, 1));

    // 두 번째 테스트 케이스
    assertEquals("02468ACE11111111", game.solution(16, 16, 2, 1));

    // 세 번째 테스트 케이스
    assertEquals("13579BDF01234567", game.solution(16, 16, 2, 2));
  }
}
