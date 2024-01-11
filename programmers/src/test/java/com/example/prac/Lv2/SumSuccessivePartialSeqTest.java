package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SumSuccessivePartialSeqTest {
    @Test
    public void testSolution() {
        SumSuccessivePartialSeq sumSuccessivePartialSeq = new SumSuccessivePartialSeq();

        int[] sequence1 = { 1, 2, 3, 4, 5 };
        int k1 = 7;
        int[] expected1 = { 2, 3 };
        assertArrayEquals(expected1, sumSuccessivePartialSeq.solution(sequence1, k1));

        int[] sequence2 = { 1, 1, 1, 2, 3, 4, 5 };
        int k2 = 5;
        int[] expected2 = { 6, 6 };
        assertArrayEquals(expected2, sumSuccessivePartialSeq.solution(sequence2, k2));

        int[] sequence3 = { 2, 2, 2, 2, 2 };
        int k3 = 6;
        int[] expected3 = { 0, 2 };
        assertArrayEquals(expected3, sumSuccessivePartialSeq.solution(sequence3, k3));
    }
}
