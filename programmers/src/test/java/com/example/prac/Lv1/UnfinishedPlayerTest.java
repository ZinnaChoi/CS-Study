package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnfinishedPlayerTest {
    @Test
    public void testSolution() {
        UnfinishedPlayer unfinishedPlayer = new UnfinishedPlayer();

        // Test Case 1
        String[] participant1 = { "leo", "kiki", "eden" };
        String[] completion1 = { "eden", "kiki" };
        String expected1 = "leo";
        String result1 = unfinishedPlayer.solution(participant1, completion1);
        assertEquals(expected1, result1);

        // Test Case 2
        String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
        String expected2 = "vinko";
        String result2 = unfinishedPlayer.solution(participant2, completion2);
        assertEquals(expected2, result2);

        // Test Case 3
        String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
        String[] completion3 = { "stanko", "ana", "mislav" };
        String expected3 = "mislav";
        String result3 = unfinishedPlayer.solution(participant3, completion3);
        assertEquals(expected3, result3);
    }
}
