package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodFightTest {

    @Test
    public void testSolution() {
        FoodFight foodFight = new FoodFight();

        // 테스트 케이스 1
        int[] input1 = { 1, 3, 4, 6 };
        String expected1 = "1223330333221";
        assertEquals(expected1, foodFight.solution(input1));

        // 테스트 케이스 2
        int[] input2 = { 1, 7, 1, 2 };
        String expected2 = "111303111";
        assertEquals(expected2, foodFight.solution(input2));

    }
}
