package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseIntTest {

    @Test
    public void testSolution() {
        ReverseInt reverseInt = new ReverseInt();

        // Test case 1
        long input1 = 118372;
        long result1 = reverseInt.solution(input1);
        assertEquals(873211, result1);

    }

    @Test
    public void stringBuilderTest() {

        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("Hello");

        // 문자열 삽입
        sb.insert(5, " World");

        // 문자열 수정
        sb.replace(0, 5, "Hi");

        // 문자열 삭제
        sb.delete(2, 4);

        assertEquals("Hiorld", sb.toString());

    }
}
