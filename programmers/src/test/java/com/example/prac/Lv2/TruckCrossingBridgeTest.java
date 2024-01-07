package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TruckCrossingBridgeTest {
    @Test
    void testSolution() {
        TruckCrossingBridge tcb = new TruckCrossingBridge();

        assertEquals(8, tcb.solution(2, 10, new int[] { 7, 4, 5, 6 }));
        assertEquals(101, tcb.solution(100, 100, new int[] { 10 }));
        assertEquals(110, tcb.solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
    }
}
