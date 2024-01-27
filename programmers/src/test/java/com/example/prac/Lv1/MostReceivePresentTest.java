package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MostReceivePresentTest {

    @Test
    public void testSolution() {
        MostReceivePresent mostReceivePresent = new MostReceivePresent();

        // Test Case 1
        String[] friends1 = { "muzi", "ryan", "frodo", "neo" };
        String[] gifts1 = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
                "frodo ryan", "neo muzi" };
        assertEquals(2, mostReceivePresent.solution(friends1, gifts1));

        // Test Case 2
        String[] friends2 = { "joy", "brad", "alessandro", "conan", "david" };
        String[] gifts2 = { "alessandro brad", "alessandro joy", "alessandro conan", "david alessandro",
                "alessandro david" };
        assertEquals(4, mostReceivePresent.solution(friends2, gifts2));

        // Test Case 3
        String[] friends3 = { "a", "b", "c" };
        String[] gifts3 = { "a b", "b a", "c a", "a c", "a c", "c a" };
        assertEquals(0, mostReceivePresent.solution(friends3, gifts3));
    }

}
