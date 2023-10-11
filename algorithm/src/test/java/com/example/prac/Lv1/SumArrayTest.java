package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSolution() {
        SumArray sumArray = new SumArray();

        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        int[][] expected = { { 4, 6 }, { 7, 9 } };
        int[][] result = sumArray.solution(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSolution2() {
        SumArray sumArray = new SumArray();

        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 4 } };
        int[][] expected = { { 4 }, { 6 } };
        int[][] result = sumArray.solution(arr1, arr2);

        assertArrayEquals(expected, result);
    }
}
