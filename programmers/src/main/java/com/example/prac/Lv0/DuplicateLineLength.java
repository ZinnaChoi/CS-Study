package com.example.prac.Lv0;

import java.util.HashMap;
import java.util.Map;

public class DuplicateLineLength {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int cnt = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
