package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SqrtRootIntegerTest {

    @Test
    public void testSolution() {
        SqrtRootInteger sqrtRootInteger = new SqrtRootInteger();

        // Test case 1
        int input1 = 121;
        long result1 = sqrtRootInteger.solution(input1);
        assertEquals(144, result1);

        // Test case 2
        int input2 = 3;
        long result2 = sqrtRootInteger.solution(input2);
        assertEquals(-1, result2);

    }

}
