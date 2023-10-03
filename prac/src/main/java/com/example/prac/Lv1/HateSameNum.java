package com.example.prac.Lv1;

import java.util.*;

public class HateSameNum {

    public int[] solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        List<Integer> resultArr = new ArrayList<>();

        resultArr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                resultArr.add(arr[i]);
            }
        }

        int[] answer = new int[resultArr.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultArr.get(i);
        }

        return answer;
    }
}
