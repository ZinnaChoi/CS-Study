package com.example.prac.Lv2;

import java.util.*;

public class FindShortestPathInGameMap {
    public int solution(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> Q = new LinkedList<>();
        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

        maps[0][0] = 0;
        Q.offer(new int[] { 0, 0 });
        int L = 1;

        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int j = 0; j < size; j++) {
                int[] cur = Q.poll();
                for (int i = 0; i < dir.length; i++) {
                    int dx = cur[0] + dir[i][0];
                    int dy = cur[1] + dir[i][1];
                    if (dx == n - 1 && dy == m - 1)
                        return L + 1;
                    if (dx >= 0 && dx < n && dy >= 0 && dy < m && maps[dx][dy] == 1) {
                        Q.offer(new int[] { dx, dy });
                        maps[dx][dy] = 0;
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
