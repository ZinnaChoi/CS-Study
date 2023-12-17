package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorsCountTest {
    @Test
    public void testSolution() {
        DivisorsCount divisorsCount = new DivisorsCount();

        // 테스트 케이스 1
        int left1 = 13;
        int right1 = 17;
        int result1 = divisorsCount.solution(left1, right1);
        assertEquals(43, result1);

        // 테스트 케이스 2
        int left2 = 24;
        int right2 = 27;
        int result2 = divisorsCount.solution(left2, right2);
        assertEquals(52, result2);

    }

}
