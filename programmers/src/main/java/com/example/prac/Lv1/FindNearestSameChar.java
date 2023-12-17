package com.example.prac.Lv1;

public class FindNearestSameChar {
    public int[] solution(String s) {

        String[] stringList = s.split("");
        int[] answer = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            int dist = -1;
            boolean found = false;
            for (int j = i; j >= 0; j--) {
                dist++;
                if (stringList[j].equals(stringList[i]) && i != j) {
                    found = true;
                    break;
                }

            }
            answer[i] = found ? dist : -1;
        }
        return answer;
    }
}
