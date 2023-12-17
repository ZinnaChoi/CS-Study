package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class HateSameNumTest {

    @Test
    public void testSolution() {
        HateSameNum hateSameNum = new HateSameNum();

        // 테스트 케이스 1: 중복이 없는 배열
        int[] input1 = { 1, 2, 3, 4, 5 };
        int[] expected1 = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected1, hateSameNum.solution(input1));

        // 테스트 케이스 2: 중복이 있는 배열
        int[] input2 = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] expected2 = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected2, hateSameNum.solution(input2));

        // 테스트 케이스 3: 빈 배열
        int[] input3 = {};
        int[] expected3 = {};
        assertArrayEquals(expected3, hateSameNum.solution(input3));
    }

}
