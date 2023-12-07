package com.example.prac.Lv2;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        return findWaysToMakeTarget(numbers, target, 0, 0);
    }

    private int findWaysToMakeTarget(int[] numbers, int target, int idx, int currentSum) {

        if (idx == numbers.length) {
            return currentSum == target ? 1 : 0;
        }

        return findWaysToMakeTarget(numbers, target, idx + 1, currentSum + numbers[idx]) + findWaysToMakeTarget(numbers, target, idx + 1, currentSum - numbers[idx]);
    }
}
