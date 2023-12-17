package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPrimeNumberTest {

    @Test
    public void testSolution() {

        FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

        // Test Case 1
        int result1 = findPrimeNumber.solution(10);
        assertEquals(4, result1);

        // Test Case 2
        int result2 = findPrimeNumber.solution(5);
        assertEquals(3, result2);
    }
}
