package com.example.prac.Lv1;

public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] wearCnt = new int[n];

        for (int i = 0; i < n; i++) {
            wearCnt[i]++;
            for (int r : reserve) {
                if (r - 1 == i)
                    wearCnt[i]++;
            }
            for (int l : lost) {
                if (l - 1 == i)
                    wearCnt[i]--;
            }
        }

        for (int i = 0; i < n; i++) {
            if (wearCnt[i] == 0) {
                if (i > 0 && wearCnt[i - 1] == 2) {
                    wearCnt[i]++;
                    wearCnt[i - 1]--;
                } else if (i < n - 1 && wearCnt[i + 1] == 2) {
                    wearCnt[i]++;
                    wearCnt[i + 1]--;
                }
            }
        }

        int answer = 0;
        for (int w : wearCnt) {
            if (w > 0) {
                answer++;
            }
        }
        return answer;
    }
}
