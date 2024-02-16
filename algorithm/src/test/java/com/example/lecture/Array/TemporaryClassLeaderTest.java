package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemporaryClassLeaderTest {
    @Test
    public void testSolution() {
        TemporaryClassLeader temporaryClassLeader = new TemporaryClassLeader();

        // Test case 1
        int[][] data1 = {
                { 9, 8, 7, 6, 5 },
                { 5, 6, 7, 8, 9 },
                { 1, 2, 3, 7, 8 },
                { 4, 5, 3, 4, 2 },
                { 6, 2, 8, 4, 2 }
        };
        int result1 = temporaryClassLeader.mySolution(5, data1);
        assertEquals(3, result1);
        // Test case 2
        int[][] data2 = {
                { 1, 2, 3, 4, 5 },
                { 2, 3, 4, 5, 6 },
                { 3, 4, 5, 6, 7 },
                { 4, 5, 6, 7, 8 },
                { 5, 6, 7, 8, 9 },
                { 6, 7, 8, 9, 1 },
                { 7, 8, 9, 1, 2 },
                { 8, 9, 1, 2, 3 },
                { 9, 1, 2, 3, 4 }
        };
        int result2 = temporaryClassLeader.mySolution(9, data2);
        assertEquals(1, result2);
    }
}
