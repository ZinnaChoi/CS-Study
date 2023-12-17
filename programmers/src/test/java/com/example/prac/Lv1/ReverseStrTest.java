package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStrTest {

    @Test
    public void testSolution() {

        ReverseStr reverseStr = new ReverseStr();

        // 테스트 케이스
        String input = "Zbcdefg";
        String result = reverseStr.solution(input);
        assertEquals("gfedcbZ", result);
    }

}
