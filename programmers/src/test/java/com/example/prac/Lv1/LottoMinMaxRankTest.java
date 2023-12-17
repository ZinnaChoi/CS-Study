package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LottoMinMaxRankTest {

    @Test
    public void testSolution() {
        LottoMinMaxRank solver = new LottoMinMaxRank();

        int[] lottos1 = { 44, 1, 0, 0, 31, 25 };
        int[] win_nums1 = { 31, 10, 45, 1, 6, 19 };
        int[] result1 = { 3, 5 };
        int[] output1 = solver.solution(lottos1, win_nums1);
        assertArrayEquals(result1, output1);

        int[] lottos2 = { 0, 0, 0, 0, 0, 0 };
        int[] win_nums2 = { 38, 19, 20, 40, 15, 25 };
        int[] result2 = { 1, 6 };
        int[] output2 = solver.solution(lottos2, win_nums2);
        assertArrayEquals(result2, output2);

        int[] lottos3 = { 45, 4, 35, 20, 3, 9 };
        int[] win_nums3 = { 20, 9, 3, 45, 4, 35 };
        int[] result3 = { 1, 1 };
        int[] output3 = solver.solution(lottos3, win_nums3);
        assertArrayEquals(result3, output3);
    }

}
