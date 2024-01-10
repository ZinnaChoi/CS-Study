package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void testSolution() {
        Fibonacci fibonacci = new Fibonacci();
        int N = 20;
        int[] expectedOutput = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
                6765 };
        assertArrayEquals(expectedOutput, fibonacci.mySolution(N));
    }
}
