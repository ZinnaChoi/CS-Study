package com.example.prac.Lv1;

public class RoughlyMadeKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int j = 0; j < targets.length; j++) {
            Boolean ok = true;
            for (String t : targets[j].split("")) {
                int[] keyList = new int[keymap.length];
                for (int k = 0; k < keymap.length; k++) {
                    for (int i = 0; i < keymap[k].length(); i++) {
                        if (String.valueOf(keymap[k].charAt(i)).equals(t)) {
                            keyList[k] = i + 1;
                            break;
                        } else {
                            keyList[k] = -1;
                        }
                    }
                }
                int minValue = 101;
                for (int key : keyList) {
                    if (key != -1 && key < minValue) {
                        minValue = key;
                    }
                }
                if (minValue == 101)
                    ok = false;
                if (ok)
                    answer[j] += minValue;
            }
            if (!ok)
                answer[j] = -1;
        }
        return answer;
    }
}
