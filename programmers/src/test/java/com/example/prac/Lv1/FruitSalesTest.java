package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FruitSalesTest {
    @Test
    public void testSolution() {
        FruitSales fruitSales = new FruitSales();

        int k1 = 3;
        int m1 = 4;
        int[] score1 = { 1, 2, 3, 1, 2, 3, 1 };
        assertEquals(8, fruitSales.solution(k1, m1, score1));

        int k2 = 4;
        int m2 = 3;
        int[] score2 = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
        assertEquals(33, fruitSales.solution(k2, m2, score2));
    }
}
