package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CokeProblemTest {

    @Test
    public void testSolution() {
        CokeProblem cokeProblem = new CokeProblem();

        // 테스트 케이스 1
        int a1 = 2;
        int b1 = 1;
        int n1 = 20;
        int result1 = cokeProblem.solution(a1, b1, n1);
        assertEquals(19, result1);

        // 테스트 케이스 2
        int a2 = 3;
        int b2 = 1;
        int n2 = 20;
        int result2 = cokeProblem.solution(a2, b2, n2);
        assertEquals(9, result2);
    }

}
