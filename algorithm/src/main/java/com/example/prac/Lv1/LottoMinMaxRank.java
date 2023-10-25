package com.example.prac.Lv1;

public class LottoMinMaxRank {
    public int[] solution(int[] lottos, int[] win_nums) {

        int maxCnt = 0;
        int minCnt = 0;

        for (int l : lottos) {
            if (l == 0)
                maxCnt++;
            for (int w : win_nums) {
                if (w == l) {
                    maxCnt++;
                    minCnt++;
                }
            }
        }
        if (maxCnt == 0)
            maxCnt++;
        if (minCnt == 0)
            minCnt++;

        int[] answer = { 7 - maxCnt, 7 - minCnt };
        return answer;
    }
}