package com.example.prac.Lv1;

import java.util.Arrays;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] awardList = new int[k];

        int min = 2000;
        for (int i = 0; i < Math.min(k, score.length); i++) {
            if (score[i] < min) {
                min = score[i];
            }
            awardList[i] = score[i];
            answer[i] = min;
        }

        Arrays.sort(awardList);

        for (int i = k; i < score.length; i++) {
            if (score[i] > awardList[0]) {
                awardList[0] = score[i];
                Arrays.sort(awardList);
            }

            answer[i] = awardList[0];
        }

        return answer;
    }
}
