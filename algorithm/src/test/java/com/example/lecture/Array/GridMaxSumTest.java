package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GridMaxSumTest {

    @Test
    void testSolution() {
        GridMaxSum gridMaxSum = new GridMaxSum();

        int N = 10;
        int[][] grid = {
                { 75, 79, 6, 72, 40, 72, 28, 43, 64, 19 },
                { 97, 71, 12, 48, 64, 95, 64, 40, 38, 24 },
                { 52, 17, 58, 64, 13, 37, 38, 5, 30, 36 },
                { 43, 30, 15, 8, 13, 21, 81, 29, 79, 33 },
                { 20, 4, 31, 24, 93, 60, 61, 19, 9, 88 },
                { 12, 33, 30, 4, 38, 62, 98, 34, 65, 33 },
                { 37, 26, 6, 60, 82, 57, 49, 85, 66, 67 },
                { 93, 4, 29, 67, 65, 96, 5, 27, 39, 87 },
                { 16, 52, 8, 7, 56, 19, 8, 53, 52, 93 },
                { 87, 55, 58, 84, 61, 92, 3, 74, 66, 34 }
        };

        int expectedMaxSum = 614;
        assertEquals(expectedMaxSum, gridMaxSum.mySolution(N, grid));
    }

}
