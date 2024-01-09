package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {
    @Test
    public void testMySolution() {
        RockPaperScissors rps = new RockPaperScissors();

        // First test case
        int[] a1 = { 1, 2, 1, 2, 1, 3, 3, 2, 3, 1 };
        int[] b1 = { 3, 3, 3, 2, 3, 3, 2, 3, 2, 3 };
        String[] expected1 = { "A", "B", "A", "D", "A", "D", "A", "B", "A", "A" };
        assertArrayEquals(expected1, rps.mySolution(a1.length, a1, b1));

        // Second test case
        int[] a2 = { 1, 1, 3, 1, 3, 3, 3, 2, 2, 2, 3, 3, 1, 1, 1, 3, 1, 2, 1, 2, 3, 1, 2, 1, 1, 1, 3, 2, 1, 1 };
        int[] b2 = { 2, 2, 2, 2, 3, 1, 2, 2, 2, 3, 1, 1, 3, 3, 3, 1, 1, 2, 3, 2, 2, 3, 2, 2, 2, 1, 1, 1, 2, 3 };
        String[] expected2 = { "B", "B", "A", "B", "D", "B", "A", "D", "D", "B", "B", "B", "A", "A", "A", "B", "D", "D",
                "A", "D", "A", "A", "D", "B", "B", "D", "B", "A", "B", "A" };
        assertArrayEquals(expected2, rps.mySolution(a2.length, a2, b2));
    }
}
