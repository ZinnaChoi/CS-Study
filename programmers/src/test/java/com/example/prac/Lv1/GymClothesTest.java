package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GymClothesTest {

    @Test
    public void testSolution() {
        GymClothes gymClothes = new GymClothes();

        // Test Case 1
        int[] lost1 = { 2, 4 };
        int[] reserve1 = { 1, 3, 5 };
        int result1 = gymClothes.solution(5, lost1, reserve1);
        assertEquals(5, result1);

        // Test Case 2
        int[] lost2 = { 2, 4 };
        int[] reserve2 = { 3 };
        int result2 = gymClothes.solution(5, lost2, reserve2);
        assertEquals(4, result2);

        // Test Case 3
        int[] lost3 = { 3 };
        int[] reserve3 = { 1 };
        int result3 = gymClothes.solution(3, lost3, reserve3);
        assertEquals(2, result3);
    }

}
