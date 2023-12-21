package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseSpecificWordTest {

  @Test
  public void testSolution() {
    ReverseSpecificWord reverseSpecificWord = new ReverseSpecificWord();

    // Test case 1
    String input1 = "kdj#@kdjg%$#kdjgk@kd$dk";
    String expectedOutput1 = "kdd#@kkgj%$#dkgjd@kj$dk";
    assertEquals(expectedOutput1, reverseSpecificWord.mySolution(input1));

    // Test case 2
    String input2 = "kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#";
    String expectedOutput2 =
      "kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#";
    assertEquals(expectedOutput2, reverseSpecificWord.mySolution(input2));
  }
}
