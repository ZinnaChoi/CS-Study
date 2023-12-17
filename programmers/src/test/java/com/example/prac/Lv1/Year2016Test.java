package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Year2016Test {

    @Test
    public void testSolution() {

        Year2016 year2016 = new Year2016();

        // Test case 1
        int a = 5;
        int b = 24;

        assertEquals("TUE", year2016.solution(a, b));

    }
}
