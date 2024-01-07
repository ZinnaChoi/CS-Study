package com.example.prac.Lv2;

import java.util.Queue;
import java.util.LinkedList;

public class TruckCrossingBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int weightOnBridge = 0;
        Queue<Integer> before = new LinkedList<>();
        Queue<int[]> onBridge = new LinkedList<>();

        for (int tw : truck_weights) {
            before.offer(tw);
        }
        while (!before.isEmpty() || !onBridge.isEmpty()) {
            time++;

            if (!onBridge.isEmpty() && onBridge.peek()[1] == time) {
                weightOnBridge -= onBridge.poll()[0];
            }

            if (!before.isEmpty() && weightOnBridge + before.peek() <= weight) {
                int cur = before.poll();
                onBridge.offer(new int[] { cur, time + bridge_length });
                weightOnBridge += cur;
            }
        }
        return time;
    }
}
