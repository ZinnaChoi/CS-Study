package com.example.prac.Lv1;

import java.util.*;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> participantMap = new HashMap<>();

        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            int count = participantMap.get(c);
            if (count == 1) {
                participantMap.remove(c);
            } else { // 동명이인이 있는 경우
                participantMap.put(c, count - 1);
            }
        }

        return participantMap.keySet().iterator().next();
    }
}
