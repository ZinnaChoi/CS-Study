package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PressKeypadTest {
    @Test
    public void testSolution() {

        PressKeypad pressKeypad = new PressKeypad();

        int[] numbers1 = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        String hand1 = "right";
        String expected1 = "LRLLLRLLRRL";
        String result1 = pressKeypad.solution(numbers1, hand1);
        assertEquals(expected1, result1);

        int[] numbers2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
        String hand2 = "left";
        String expected2 = "LRLLRRLLLRR";
        String result2 = pressKeypad.solution(numbers2, hand2);
        assertEquals(expected2, result2);

        int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        String hand3 = "right";
        String expected3 = "LLRLLRLLRL";
        String result3 = pressKeypad.solution(numbers3, hand3);
        assertEquals(expected3, result3);

    }
}
