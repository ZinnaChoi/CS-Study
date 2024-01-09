package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPrimeTest {
    @Test
    public void testSolution() {
        FindPrime findPrime = new FindPrime();

        // Test case 1
        assertEquals(3, findPrime.solution("17"));

    }
}
