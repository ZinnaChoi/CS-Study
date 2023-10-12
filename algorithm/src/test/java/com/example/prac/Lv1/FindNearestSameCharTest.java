package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindNearestSameCharTest {

    @Test
    public void testSolution() {
        FindNearestSameChar findNearestSameChar = new FindNearestSameChar();

        String s1 = "banana";
        int[] result1 = findNearestSameChar.solution(s1);
        int[] expected1 = { -1, -1, -1, 2, 2, 2 };
        assertArrayEquals(expected1, result1);

        String s2 = "foobar";
        int[] result2 = findNearestSameChar.solution(s2);
        int[] expected2 = { -1, -1, 1, -1, -1, -1 };
        assertArrayEquals(expected2, result2);

    }

}
