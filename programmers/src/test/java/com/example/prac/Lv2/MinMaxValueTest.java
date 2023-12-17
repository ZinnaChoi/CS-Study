package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinMaxValueTest {

    @Test
    public void testsolution() {

        MinMaxValue minMaxValue = new MinMaxValue();

        // 테스트 케이스1
        String s1 = "1 2 3 4";
        String result1 = minMaxValue.solution(s1);
        assertEquals("1 4", result1);

        // 테스트 케이스2
        String s2 = "-1 -2 -3 -4";
        String result2 = minMaxValue.solution(s2);
        assertEquals("-4 -1", result2);

        // 테스트 케이스3
        String s3 = "-1 -1";
        String result3 = minMaxValue.solution(s3);
        assertEquals("-1 -1", result3);

    }

}
