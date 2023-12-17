package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExpressNumberTest {

    @Test
    public void testSolution() {
        ExpressNumber expressNumber = new ExpressNumber();
        int n = 15;
        int expected = 4;
        int result = expressNumber.solution(n);
        assertEquals(expected, result);
    }
}