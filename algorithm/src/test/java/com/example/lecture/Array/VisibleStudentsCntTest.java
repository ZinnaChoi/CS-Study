package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VisibleStudentsCntTest {

    @Test
    public void testSolution() {
        VisibleStudentsCnt test = new VisibleStudentsCnt();

        // Test case 1
        int N1 = 100;
        int[] heights1 = { 56, 32, 76, 17, 30, 44, 34, 9, 72, 52, 79, 30, 21, 10, 77, 44, 3, 64, 93, 21, 50, 54, 65, 22,
                47, 82, 17, 51, 43, 93, 51, 98, 40, 12, 88, 100, 96, 53, 80, 18, 23, 78, 95, 49, 71, 10, 81, 1, 30, 11,
                95, 87, 3, 60, 15, 5, 60, 68, 10, 10, 28, 51, 55, 70, 11, 36, 43, 59, 46, 74, 67, 37, 48, 86, 66, 79,
                73, 24, 40, 90, 75, 2, 89, 45, 2, 19, 94, 94, 40, 20, 44, 16, 37, 8, 38, 62, 79, 55, 10, 78 };
        assertEquals(6, test.mySolution(N1, heights1));

        // Test case 2
        int N2 = 10;
        int[] heights2 = { 23, 10, 46, 62, 42, 39, 11, 98, 71, 41 };
        assertEquals(4, test.mySolution(N2, heights2));

    }

}
