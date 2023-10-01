package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinRectTest {

    @Test
    public void testSolution() {
        MinRect minRect = new MinRect();

        // Test case 1
        int[][] sizes1 = { { 60, 50 }, { 30, 70 }, { 80, 40 } };
        int result1 = minRect.solution(sizes1);
        assertEquals(4000, result1);

    }
}
