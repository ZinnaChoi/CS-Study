package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OneTwoFourNumTest {

    @Test
    public void testSolution() {
        OneTwoFourNum oneTwoFourNum = new OneTwoFourNum();

        assertEquals("1", oneTwoFourNum.solution(1));
        assertEquals("2", oneTwoFourNum.solution(2));
        assertEquals("4", oneTwoFourNum.solution(3));
        assertEquals("11", oneTwoFourNum.solution(4));
    }

}
