package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReversedPrimeTest {
    @Test
    public void testSolution() {
        ReversedPrime reversedPrime = new ReversedPrime();

        // Test case 1
        int[] input1 = new int[] { 32, 55, 62, 20, 250, 370, 200, 30, 100 };
        int[] expectedOutput1 = new int[] { 23, 2, 73, 2, 3 };
        assertArrayEquals(expectedOutput1, reversedPrime.mySolution(input1));
    }
}
