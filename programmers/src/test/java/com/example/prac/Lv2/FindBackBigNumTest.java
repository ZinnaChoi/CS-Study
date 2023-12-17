package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FindBackBigNumTest {

    @Test
    public void testSolution() {
        FindBackBigNum findBackBigNum = new FindBackBigNum();
        int[] numbers1 = { 2, 3, 3, 5 };
        int[] expected1 = { 3, 5, 5, -1 };
        int[] result1 = findBackBigNum.solution(numbers1);
        assertArrayEquals(expected1, result1);

        int[] numbers2 = { 9, 1, 5, 3, 6, 2 };
        int[] expected2 = { -1, 5, 6, 6, -1, -1 };
        int[] result2 = findBackBigNum.solution(numbers2);
        assertArrayEquals(expected2, result2);
    }

}
