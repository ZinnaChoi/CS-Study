package com.example.prac.Lv0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DuplicateLineLengthTest {
    @Test
    public void testSolution() {
        DuplicateLineLength dll = new DuplicateLineLength();

        // Test case 1
        int[][] lines1 = { { 0, 1 }, { 2, 5 }, { 3, 9 } };
        assertEquals(2, dll.solution(lines1));

        // Test case 2
        int[][] lines2 = { { -1, 1 }, { 1, 3 }, { 3, 9 } };
        assertEquals(0, dll.solution(lines2));

        // Test case 3
        int[][] lines3 = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
        assertEquals(8, dll.solution(lines3));
    }
}
