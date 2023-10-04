package com.example.prac.Lv1;

public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        String left = "";
        for (int i = 1; i < food.length; i++) {
            left += String.valueOf(i).repeat(food[i] / 2);
        }

        answer += left + '0';

        for (int i = left.length() - 1; i >= 0; i--) {
            answer += answer.charAt(i);
        }

        return answer;
    }

    public String solution2(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}
