package com.example.prac.Lv1;

import java.util.*;

public class AddTwoSelected {
    public int[] solution(int[] numbers) {

        Set<Integer> sumSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumSet.size()];

        int idx = 0;
        for (Integer s : sumSet) {
            answer[idx] = s;
            idx++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
