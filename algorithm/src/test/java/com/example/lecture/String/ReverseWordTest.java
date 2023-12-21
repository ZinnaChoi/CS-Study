package com.example.lecture.String;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordTest {

  @Test
  public void testSolution() {
    ReverseWord reverseWord = new ReverseWord();

    // Test case 1
    String[] input1 = { "good", "Time", "Big" };
    String[] expectedOutput1 = { "doog", "emiT", "giB" };
    assertArrayEquals(
      expectedOutput1,
      reverseWord.mySolution(input1.length, input1)
    );

    // Test case 2
    String[] input2 = {
      "dkjg",
      "Gkkjdg",
      "DGSGjkjdgkAGGA",
      "dkKJKLHLkjlkd",
      "HLKJLKJLKHL",
      "dkjkghlsKJLJLJLKJK",
      "dkNBHGKJHKJHKJHKJHKJHKJHKJH",
      "djklgj",
      "skjglkjkljdlk",
      "kdjglk",
    };
    String[] expectedOutput2 = {
      "gjkd",
      "gdjkkG",
      "AGGAkgdjkjGSGD",
      "dkljkLHLKJKkd",
      "LHKLJKLJKLH",
      "KJKLJLJLJKslhgkjkd",
      "HJKHJKHJKHJKHJKHJKHJKGHBNkd",
      "jglkjd",
      "kldjlkjklgjks",
      "klgjdk",
    };
    assertArrayEquals(
      expectedOutput2,
      reverseWord.mySolution(input2.length, input2)
    );
  }
}
