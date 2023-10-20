package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakePrimeNumberTest {

    @Test
    public void testSolution() {
        MakePrimeNumber makePrimeNumber = new MakePrimeNumber();

        // Test Case 1
        int[] nums1 = { 1, 2, 3, 4 };
        int result1 = makePrimeNumber.solution(nums1);
        assertEquals(1, result1);

        // Test Case 2
        int[] nums2 = { 1, 2, 7, 6, 4 };
        int result2 = makePrimeNumber.solution(nums2);
        assertEquals(4, result2);
    }

}
