package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddTwoSelectedTest {
    @Test
    public void testSolution() {

        AddTwoSelected addTwoSelected = new AddTwoSelected();

        // 테스트 케이스 1
        int[] numbers1 = { 2, 1, 3, 4, 1 };
        int[] expected1 = { 2, 3, 4, 5, 6, 7 };
        int[] result1 = addTwoSelected.solution(numbers1);
        assertArrayEquals(expected1, result1);

        // 테스트 케이스 2
        int[] numbers2 = { 5, 0, 2, 7 };
        int[] expected2 = { 2, 5, 7, 9, 12 };
        int[] result2 = addTwoSelected.solution(numbers2);
        assertArrayEquals(expected2, result2);

    }
}
