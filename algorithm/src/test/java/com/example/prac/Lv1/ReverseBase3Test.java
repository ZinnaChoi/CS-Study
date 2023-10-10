package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseBase3Test {

    @Test
    public void testSolution() {

        ReverseBase3 reverseBase3 = new ReverseBase3();

        // 테스트 케이스 1
        int n1 = 45;
        int result1 = reverseBase3.solution(n1);
        assertEquals(7, result1);

        // 테스트 케이스 2
        int n2 = 125;
        int result2 = reverseBase3.solution(n2);
        assertEquals(229, result2);

    }

}
