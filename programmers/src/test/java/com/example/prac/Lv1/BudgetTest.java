package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    @Test
    public void testSolution() {
        Budget budget = new Budget();

        // 테스트 케이스 1
        int[] d1 = { 1, 3, 2, 5, 4 };
        int budget1 = 9;
        int result1 = budget.solution(d1, budget1);
        assertEquals(3, result1);

        // 테스트 케이스 2
        int[] d2 = { 2, 2, 3, 3 };
        int budget2 = 10;
        int result2 = budget.solution(d2, budget2);
        assertEquals(4, result2);
    }

}
