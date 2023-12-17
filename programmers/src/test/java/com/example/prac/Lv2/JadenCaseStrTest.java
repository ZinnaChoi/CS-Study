package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JadenCaseStrTest {

    @Test
    public void testsolution() {

        JadenCaseStr jadenCaseStr = new JadenCaseStr();

        // 테스트 케이스 1
        String s1 = "3people unFollowed me";
        String result1 = jadenCaseStr.solution(s1);
        assertEquals("3people Unfollowed Me", result1);

        // 테스트 케이스 2
        String s2 = "for the last week";
        String result2 = jadenCaseStr.solution(s2);
        assertEquals("For The Last Week", result2);

    }

}
