package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RoughlyMadeKeyboardTest {
    @Test
    public void testSolution() {
        RoughlyMadeKeyboard keyboard = new RoughlyMadeKeyboard();

        String[] keymap1 = { "ABACD", "BCEFD" };
        String[] targets1 = { "ABCD", "AABB" };
        int[] expected1 = { 9, 4 };
        int[] result1 = keyboard.solution(keymap1, targets1);
        assertArrayEquals(expected1, result1);

        String[] keymap2 = { "AA" };
        String[] targets2 = { "B" };
        int[] expected2 = { -1 };
        int[] result2 = keyboard.solution(keymap2, targets2);
        assertArrayEquals(expected2, result2);

        String[] keymap3 = { "AGZ", "BSSS" };
        String[] targets3 = { "ASA", "BGZ" };
        int[] expected3 = { 4, 6 };
        int[] result3 = keyboard.solution(keymap3, targets3);
        assertArrayEquals(expected3, result3);
    }
}
