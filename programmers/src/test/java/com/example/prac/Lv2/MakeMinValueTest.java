package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakeMinValueTest {
    @Test
    public void testSolution() {
        MakeMinValue makeMinValue = new MakeMinValue();

        // Test case 1
        int[] A1 = { 1, 4, 2 };
        int[] B1 = { 5, 4, 4 };
        int expected1 = 29;
        int result1 = makeMinValue.solution(A1, B1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] A2 = { 1, 2 };
        int[] B2 = { 3, 4 };
        int expected2 = 10;
        int result2 = makeMinValue.solution(A2, B2);
        assertEquals(expected2, result2);
    }
}
