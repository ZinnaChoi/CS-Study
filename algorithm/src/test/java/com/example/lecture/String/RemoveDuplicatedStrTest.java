package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatedStrTest {

  @Test
  public void testSolution() {
    RemoveDuplicatedStr removeDuplicatedStr = new RemoveDuplicatedStr();

    assertEquals(
      "kjglseiow",
      removeDuplicatedStr.mySolution("kjkgjlskjekieogiwo")
    );
    assertEquals(
      "qiutowpy",
      removeDuplicatedStr.mySolution(
        "qiutoiwuotiqpituoiwuiotuowutowiutoityioqp"
      )
    );
  }
}
