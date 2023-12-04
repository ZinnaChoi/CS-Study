package com.example.prac.Lv2;
import java.util.*;

public class Tuple {
    public int[] solution(String s) {
        
        String[] stringArray = s.split("\\},\\{");
        
        int[] answer = new int[stringArray.length];
        String[] sortedArray = Arrays.stream(stringArray)
                .map(str -> str.replaceAll("[{}]", ""))
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        
        int idx = 0;
        Set<Integer> numSet = new HashSet<>();
        for (String str: sortedArray){
            for (String tt: str.split(",")){
                int strInt = Integer.parseInt(tt);
                if (!numSet.contains(strInt)){
                    numSet.add(strInt);
                    answer[idx] = strInt;
                }
            }
            idx++;
        }
        return answer;
    }
}
