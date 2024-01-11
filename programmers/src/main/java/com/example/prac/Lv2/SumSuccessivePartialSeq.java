package com.example.prac.Lv2;

public class SumSuccessivePartialSeq {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = 0;
        int currentSum = sequence[0];

        int[] result = new int[] { 0, sequence.length - 1 };

        while (start <= end && end < sequence.length) {
            if (currentSum < k) {
                end++;
                if (end < sequence.length) {
                    currentSum += sequence[end];
                }
            } else if (currentSum > k) {
                currentSum -= sequence[start];
                start++;
            } else {
                if (end - start < result[1] - result[0]) {
                    result[0] = start;
                    result[1] = end;
                }
                end++;
                if (end < sequence.length) {
                    currentSum += sequence[end];
                }
            }
        }
        return result;
    }
}
