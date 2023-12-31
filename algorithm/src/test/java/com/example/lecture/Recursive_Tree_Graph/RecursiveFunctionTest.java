package com.example.lecture.Recursive_Tree_Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecursiveFunctionTest {

  @Test
  public void testSolution() {
    RecursiveFunction recursiveFunction = new RecursiveFunction();

    assertEquals("1 2 3", recursiveFunction.mySolution(3));
    assertEquals("1 2 3 4 5 6 7 8 9 10", recursiveFunction.mySolution(10));
  }
}
