package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {
    @Test
    public void testSolution() {
        PrimeNumber primeNumber = new PrimeNumber();

        // Test case 1
        int N1 = 200000;
        assertEquals(17984, primeNumber.mySolution(N1));

        // Test case 2
        int N2 = 100000;
        assertEquals(9592, primeNumber.mySolution(N2));

    }

}
