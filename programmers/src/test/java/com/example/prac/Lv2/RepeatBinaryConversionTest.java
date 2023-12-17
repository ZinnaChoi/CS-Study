package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RepeatBinaryConversionTest {

    @Test
    public void testSolution() {
        RepeatBinaryConversion RepeatBinaryConversion = new RepeatBinaryConversion();

        // 테스트 케이스 1
        int[] result1 = RepeatBinaryConversion.solution("110010101001");
        int[] expected1 = { 3, 8 };
        assertArrayEquals(expected1, result1);

        // 테스트 케이스 2
        int[] result2 = RepeatBinaryConversion.solution("01110");
        int[] expected2 = { 3, 3 };
        assertArrayEquals(expected2, result2);
    }
}
