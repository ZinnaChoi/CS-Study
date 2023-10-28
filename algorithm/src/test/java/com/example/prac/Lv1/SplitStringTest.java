package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SplitStringTest {

    @Test
    public void testSolution() {
        SplitString splitString = new SplitString();

        // 테스트 케이스 1
        String input1 = "banana";
        int expected1 = 3;
        int result1 = splitString.solution(input1);
        assertEquals(expected1, result1);

        // 테스트 케이스 2
        String input2 = "abracadabra";
        int expected2 = 6;
        int result2 = splitString.solution(input2);
        assertEquals(expected2, result2);

        // 테스트 케이스 3
        String input3 = "aaabbaccccabba";
        int expected3 = 3;
        int result3 = splitString.solution(input3);
        assertEquals(expected3, result3);

    }

}
