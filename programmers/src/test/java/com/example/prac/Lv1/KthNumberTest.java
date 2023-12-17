package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KthNumberTest {
    @Test
    public void testSolution() {
        KthNumber kthNumber = new KthNumber();

        // 테스트 케이스 1
        int[] input1 = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] result1 = kthNumber.solution(input1, commands);
        int[] expected1 = { 5, 6, 3 };
        assertArrayEquals(expected1, result1);

    }

}
