package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CalculateGCDLCMTest {

    @Test
    public void testsolution() {

        CalculateGCDLCM calculateGCDLCM = new CalculateGCDLCM();

        // 테스트 케이스 1
        int n1 = 3;
        int m1 = 12;
        int[] expected1 = { 3, 12 };
        int[] result1 = calculateGCDLCM.solution(n1, m1);
        assertArrayEquals(expected1, result1);

        // 테스트 케이스 2
        int n2 = 2;
        int m2 = 5;
        int[] expected2 = { 1, 10 };
        int[] result2 = calculateGCDLCM.solution(n2, m2);
        assertArrayEquals(expected2, result2);
    }

}
