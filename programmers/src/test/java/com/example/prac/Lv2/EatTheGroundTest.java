package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EatTheGroundTest {

    @Test
    public void testSolution() {
        EatTheGround eatTheGround = new EatTheGround();
        int[][] land = {
                { 1, 2, 3, 5 },
                { 5, 6, 7, 8 },
                { 4, 3, 2, 1 }
        };
        int expected = 16;
        int result = eatTheGround.solution(land);
        assertEquals(expected, result);
    }

}
