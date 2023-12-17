package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpAndTeleportTest {

  @Test
  public void testSolution() {
    JumpAndTeleport jumpAndTeleport = new JumpAndTeleport();

    // Test case 1
    int result1 = jumpAndTeleport.solution(5);
    assertEquals(2, result1);

    // Test case 2
    int result2 = jumpAndTeleport.solution(6);
    assertEquals(2, result2);

    // Test case 3
    int result3 = jumpAndTeleport.solution(5000);
    assertEquals(5, result3);
  }
}
