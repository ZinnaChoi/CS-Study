package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class PrintBigNumberTest {

    @Test
    void testSolution() {
        PrintBigNumber printBigNumber = new PrintBigNumber();

        int[] nums1 = { 7, 3, 10, 9, 5, 6, 7, 9, 20, 19, 12, 15 };
        int[] expected1 = { 7, 10, 6, 7, 9, 20, 15 };
        assertArrayEquals(expected1, printBigNumber.mySolution(12, nums1));

        int[] nums2 = { 7, 3, 10, 9, 5, 6, 7, 9, 20, 19, 12, 11, 15, 19 };
        int[] expected2 = { 7, 10, 6, 7, 9, 20, 15, 19 };
        assertArrayEquals(expected2, printBigNumber.mySolution(14, nums2));
    }

}
