package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PeakTest {

    @Test
    public void testSolution() {
        Peak peak = new Peak();
        int N = 5;
        int[][] map = {
                { 5, 3, 7, 2, 3 },
                { 3, 7, 1, 6, 1 },
                { 7, 2, 5, 3, 4 },
                { 4, 3, 6, 4, 1 },
                { 8, 7, 3, 5, 2 }
        };
        int expected = 10;
        int actual = peak.mySoultion(N, map);
        assertEquals(expected, actual);
    }
}
