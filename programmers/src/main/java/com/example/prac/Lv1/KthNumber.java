package com.example.prac.Lv1;

import java.util.*;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int order = 0;
        for (int[] cmd : commands) {
            int[] tmpArr = new int[cmd[1] - cmd[0] + 1];
            int idx = 0;
            for (int i = cmd[0] - 1; i <= cmd[1] - 1; i++) {
                tmpArr[idx] = array[i];
                idx++;
            }
            Arrays.sort(tmpArr);
            answer[order] = tmpArr[cmd[2] - 1];
            order++;
        }
        return answer;
    }

}
