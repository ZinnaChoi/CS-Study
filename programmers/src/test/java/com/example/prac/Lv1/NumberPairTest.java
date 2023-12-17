package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberPairTest {

    @Test
    public void testSolution() {

        NumberPair numberPair = new NumberPair();

        // Test case 1
        String inputX1 = "100";
        String inputY1 = "2345";
        String result1 = numberPair.solution(inputX1, inputY1);
        assertEquals("-1", result1);

        // Test case 2
        String inputX2 = "100";
        String inputY2 = "2345";
        String result2 = numberPair.solution(inputX2, inputY2);
        assertEquals("-1", result2);

        // Test case 3
        String inputX3 = "100";
        String inputY3 = "2345";
        String result3 = numberPair.solution(inputX3, inputY3);
        assertEquals("-1", result3);

    }

}
