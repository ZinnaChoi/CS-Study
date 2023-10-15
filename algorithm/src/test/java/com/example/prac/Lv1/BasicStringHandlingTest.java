package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicStringHandlingTest {

    @Test
    public void testsolution() {

        BasicStringHandling basicStringHandling = new BasicStringHandling();

        // 테스트 케이스1
        String s1 = "a234";
        Boolean result1 = basicStringHandling.solution(s1);
        assertEquals(false, result1);

        // 테스트 케이스2
        String s2 = "1234";
        Boolean result2 = basicStringHandling.solution(s2);
        assertEquals(true, result2);
    }
}
