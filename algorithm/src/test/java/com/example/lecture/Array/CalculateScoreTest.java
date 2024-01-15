package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateScoreTest {
    @Test
    public void testSolution() {
        CalculateScore calculateScore = new CalculateScore();
        int[] input = { 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1,
                1, 0, 0, 0, 1, 0, 0, 1 };
        int expected = 41;

        int result = calculateScore.mySolution(input);
        assertEquals(expected, result);
    }
}
