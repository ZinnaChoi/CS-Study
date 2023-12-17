package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FailRateTest {

    @Test
    public void testSolution() {
        FailRate failRate = new FailRate();

        // Test Case 1
        int N1 = 5;
        int[] stages1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] expected1 = { 3, 4, 2, 1, 5 };
        int[] result1 = failRate.solution(N1, stages1);

        assertArrayEquals(expected1, result1);

        // Test Case 2
        int N2 = 4;
        int[] stages2 = { 4, 4, 4, 4, 4 };
        int[] expected2 = { 4, 1, 2, 3 };
        int[] result2 = failRate.solution(N2, stages2);
        assertArrayEquals(expected2, result2);
    }
}
