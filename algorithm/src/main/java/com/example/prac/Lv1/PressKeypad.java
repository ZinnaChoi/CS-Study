package com.example.prac.Lv1;

public class PressKeypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] leftHand = { 3, 0 };
        int[] rightHand = { 3, 2 };

        for (int num : numbers) {
            int[] position = getNumberPosition(num);
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftHand = position;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightHand = position;
            } else {
                int leftDistance = getDistance(leftHand, position);
                int rightDistance = getDistance(rightHand, position);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer.append("L");
                    leftHand = position;
                } else {
                    answer.append("R");
                    rightHand = position;
                }
            }
        }
        return answer.toString();
    }

    private int[] getNumberPosition(int num) {
        int[] position = new int[2];
        position[0] = (num - 1) / 3;
        position[1] = (num - 1) % 3;
        if (num == 0) {
            position[0] = 3;
            position[1] = 1;
        }
        return position;
    }

    private int getDistance(int[] handPosition, int[] numberPosition) {
        return Math.abs(handPosition[0] - numberPosition[0]) + Math.abs(handPosition[1] - numberPosition[1]);
    }

}