package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PhoneketmonTest {

    @Test
    public void testsolution() {

        Phoneketmon phoneketmon = new Phoneketmon();

        // 테스트 케이스 1
        int[] nums1 = { 3, 1, 2, 3 };
        int result1 = phoneketmon.solution(nums1);
        assertEquals(2, result1);

        // 테스트 케이스 2
        int[] nums2 = { 3, 3, 3, 2, 2, 4 };
        int result2 = phoneketmon.solution(nums2);
        assertEquals(3, result2);

        // 테스트 케이스 3
        int[] nums3 = { 3, 3, 3, 2, 2, 2 };
        int result3 = phoneketmon.solution(nums3);
        assertEquals(2, result3);

    }

}
