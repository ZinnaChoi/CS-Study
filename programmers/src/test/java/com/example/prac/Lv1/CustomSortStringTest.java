package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomSortStringTest {

    @Test
    public void testsolution() {

        CustomSortString customSortString = new CustomSortString();

        // 테스트 케이스 1
        String[] strings1 = { "sun", "bed", "car" };
        int n1 = 1;
        String[] expected1 = { "car", "bed", "sun" };
        String[] result1 = customSortString.solution(strings1, n1);
        assertArrayEquals(expected1, result1);

        // 테스트 케이스 2
        String[] strings2 = { "abce", "abcd", "cdx" };
        int n2 = 2;
        String[] expected2 = { "abcd", "abce", "cdx" };
        String[] result2 = customSortString.solution(strings2, n2);
        assertArrayEquals(expected2, result2);

    }

}
