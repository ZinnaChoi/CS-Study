package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiPaintCoatsTest {

    @Test
    public void testSolution() {
        MultiPaintCoats painter = new MultiPaintCoats();

        // 테스트 케이스 1
        int result1 = painter.solution(8, 4, new int[] { 2, 3, 6 });
        assertEquals(2, result1);

        // 테스트 케이스 2
        int result2 = painter.solution(5, 4, new int[] { 1, 3 });
        assertEquals(1, result2);

        // 테스트 케이스 3
        int result3 = painter.solution(4, 1, new int[] { 1, 2, 3, 4 });
        assertEquals(4, result3);
    }

}
