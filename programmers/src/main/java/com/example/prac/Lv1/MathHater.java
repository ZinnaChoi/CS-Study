package com.example.prac.Lv1;

import java.util.*;

public class MathHater {

    public int[] solution(int[] answers) {

        int[] temp = { 1, 3, 4, 5 };
        int[] temp2 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == i % 5 + 1)
                score1++;
            if (answers[i] == (i % 2 == 0 ? 2 : temp[(i / 2) % 4]))
                score2++;
            if (answers[i] == temp2[i % 10])
                score3++;
        }

        List<Integer> answerList = new ArrayList<>();

        int[] scoreList = { score1, score2, score3 };
        Arrays.sort(scoreList);

        if (scoreList[2] == score1)
            answerList.add(1);
        if (scoreList[2] == score2)
            answerList.add(2);
        if (scoreList[2] == score3)
            answerList.add(3);

        return answerList.stream().mapToInt(x -> x).toArray();
    }

}
