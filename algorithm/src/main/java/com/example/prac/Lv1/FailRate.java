package com.example.prac.Lv1;

import java.util.*;

public class FailRate {
    public int[] solution(int N, int[] stages) {

        // 스테이지 별 실패율 (key: 스테이지, value: 실패율)
        Map<Integer, Double> failMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int numerator = 0;
            int denominator = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i)
                    numerator++;
                if (stages[j] >= i)
                    denominator++;

                if (denominator == 0) {
                    failMap.put(i, (double) 0);
                } else {
                    failMap.put(i, (double) numerator / denominator);
                }
            }
        }

        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(failMap.entrySet());

        // Value 역순, key 순으로 정렬
        entryList.sort(Map.Entry.<Integer, Double>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()));

        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}
