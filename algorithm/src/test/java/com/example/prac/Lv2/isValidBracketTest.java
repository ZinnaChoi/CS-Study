package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class isValidBracketTest {
    @Test
    public void testSolution() {
        isValidBracket isValidBracket = new isValidBracket();

        assertTrue(isValidBracket.solution("()()"));
        assertTrue(isValidBracket.solution("(())()"));
        assertFalse(isValidBracket.solution(")()("));
        assertFalse(isValidBracket.solution("(()("));
    }
}
