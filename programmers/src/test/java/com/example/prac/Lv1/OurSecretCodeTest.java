package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OurSecretCodeTest {
    @Test
    public void testSolution() {
        // Test Case 1
        String result1 = OurSecretCode.solution("aukks", "wbqd", 5);
        assertEquals("happy", result1);

        // Test Case 2
        String result2 = OurSecretCode.solution("ybc", "az", 1);
        assertEquals("bcd", result2);
    }
}
