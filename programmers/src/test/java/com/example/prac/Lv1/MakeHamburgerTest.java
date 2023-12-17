package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakeHamburgerTest {

    @Test
    public void testSolution() {
        MakeHamburger makeHamburger = new MakeHamburger();
        int[] ingredients1 = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
        int expected1 = 2;
        int result1 = makeHamburger.solution(ingredients1);
        assertEquals(expected1, result1);

        int[] ingredients2 = { 1, 3, 2, 1, 2, 1, 3, 1, 2 };
        int expected2 = 0;
        int result2 = makeHamburger.solution(ingredients2);
        assertEquals(expected2, result2);
    }
}
