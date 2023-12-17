package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WeaponWeightTest {
    @Test
    public void testSolution() {
        WeaponWeight weaponWeight = new WeaponWeight();

        // 테스트 케이스 1
        int result1 = weaponWeight.solution(5, 3, 2);
        assertEquals(10, result1);

        // 테스트 케이스 2
        int result2 = weaponWeight.solution(10, 3, 2);
        assertEquals(21, result2);
    }
}
