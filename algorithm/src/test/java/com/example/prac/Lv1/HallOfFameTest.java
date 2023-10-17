package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class HallOfFameTest {

    @Test
    public void testSolution() {
        HallOfFame hallOfFame = new HallOfFame();

        // Test case 1
        int k1 = 3;
        int[] score1 = { 10, 100, 20, 150, 1, 100, 200 };
        int[] expected1 = { 10, 10, 10, 20, 20, 100, 100 };
        int[] result1 = hallOfFame.solution(k1, score1);
        assertArrayEquals(expected1, result1);

        // Test case 2
        int k2 = 4;
        int[] score2 = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
        int[] expected2 = { 0, 0, 0, 0, 20, 40, 70, 70, 150, 300 };
        int[] result2 = hallOfFame.solution(k2, score2);
        assertArrayEquals(expected2, result2);
    }

}
