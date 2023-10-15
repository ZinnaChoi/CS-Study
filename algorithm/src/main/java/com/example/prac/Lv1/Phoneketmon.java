package com.example.prac.Lv1;

import java.util.*;

public class Phoneketmon {

    public int solution(int[] nums) {

        List<Integer> numSet = new ArrayList<>();
        for (int n : nums) {
            if (!numSet.contains(n)) {
                numSet.add(n);
            }
        }

        return numSet.size() > nums.length / 2 ? nums.length / 2 : numSet.size();
    }

}
