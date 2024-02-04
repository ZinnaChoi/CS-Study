package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MagicElevatorTest {

    @Test
    public void testSolution() {
        MagicElevator magicElevator = new MagicElevator();

        // 테스트 케이스 1
        assertEquals(6, magicElevator.solution(16));

        // 테스트 케이스 2
        assertEquals(16, magicElevator.solution(2554));
    }
}
