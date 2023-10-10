package com.example.prac.Lv1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordToNumTest {

    @Test
    public void testSolution() {

        WordToNum wordToNum = new WordToNum();

        // 테스트 케이스 1
        String input1 = "one4seveneight";
        int result1 = wordToNum.solution(input1);
        assertEquals(1478, result1);

        // 테스트 케이스 2
        String input2 = "23four5six7";
        int result2 = wordToNum.solution(input2);
        assertEquals(234567, result2);
    }

}
