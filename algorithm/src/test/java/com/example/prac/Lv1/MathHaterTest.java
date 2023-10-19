package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MathHaterTest {

    @Test
    public void testSolution() {
        MathHater mathHater = new MathHater();

        int[] test1 = { 1, 2, 3, 4, 5 };
        int[] result1 = mathHater.solution(test1);
        int[] expected1 = { 1 };
        assertArrayEquals(result1, expected1);

        int[] test2 = { 1, 3, 2, 4, 2 };
        int[] result2 = mathHater.solution(test2);
        int[] expected2 = { 1, 2, 3 };
        assertArrayEquals(result2, expected2);
    }

}
