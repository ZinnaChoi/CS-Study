package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GetRankTest {

    @Test
    public void testSolution() {
        GetRank getRank = new GetRank();

        int[] scores1 = { 65, 54, 81, 56, 54, 70, 61, 87, 99, 58, 78, 99, 99, 70, 96, 60, 77, 84, 67, 86, 84, 98, 63,
                96, 83, 54, 52, 86, 78, 69 };
        int[] expected1 = { 21, 27, 13, 26, 27, 17, 23, 7, 1, 25, 14, 1, 1, 17, 5, 24, 16, 10, 20, 8, 10, 4, 22, 5, 12,
                27, 30, 8, 14, 19 };
        assertArrayEquals(expected1, getRank.mySolution(30, scores1));

        int[] scores2 = { 97, 68, 81, 89, 74, 90, 67 };
        int[] expected2 = { 1, 6, 4, 3, 5, 2, 7 };
        assertArrayEquals(expected2, getRank.mySolution(7, scores2));
    }
}
