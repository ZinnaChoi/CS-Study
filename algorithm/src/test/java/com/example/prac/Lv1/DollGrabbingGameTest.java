package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DollGrabbingGameTest {

    @Test
    public void testSolution() {
        DollGrabbingGame game = new DollGrabbingGame();
        int[][] board = {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3 },
                { 0, 2, 5, 0, 1 },
                { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 }
        };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        int expectedResult = 4;

        int result = game.solution(board, moves);

        assertEquals(expectedResult, result);
    }

}
