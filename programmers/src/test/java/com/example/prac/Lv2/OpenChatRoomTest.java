package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class OpenChatRoomTest {

  @Test
  public void testSolution() {
    OpenChatRoom openChatRoom = new OpenChatRoom();

    String[] input = {
      "Enter uid1234 Muzi",
      "Enter uid4567 Prodo",
      "Leave uid1234",
      "Enter uid1234 Prodo",
      "Change uid4567 Ryan",
    };
    String[] expectedOutput = {
      "Prodo님이 들어왔습니다.",
      "Ryan님이 들어왔습니다.",
      "Prodo님이 나갔습니다.",
      "Prodo님이 들어왔습니다.",
    };

    String[] actualOutput = openChatRoom.solution(input);

    assertArrayEquals(expectedOutput, actualOutput);
  }
}
