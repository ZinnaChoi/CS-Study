package com.example.prac.Lv2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindShortestPathInGameMapTest {

    @Test
    public void testSolution() {
        FindShortestPathInGameMap findShortestPathInGameMap = new FindShortestPathInGameMap();

        int[][] maps1 = {
                { 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1 }
        };
        assertEquals(11, findShortestPathInGameMap.solution(maps1));

        int[][] maps2 = {
                { 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1 }
        };
        assertEquals(-1, findShortestPathInGameMap.solution(maps2));
    }
}