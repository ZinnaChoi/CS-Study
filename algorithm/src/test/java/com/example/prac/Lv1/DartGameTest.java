package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DartGameTest {

    @Test
    public void testSolution() {
        DartGame dartGame = new DartGame();

        assertEquals(37, dartGame.solution("1S2D*3T"));
        assertEquals(9, dartGame.solution("1D2S#10S"));
        assertEquals(3, dartGame.solution("1D2S0T"));
        assertEquals(23, dartGame.solution("1S*2T*3S"));
        assertEquals(5, dartGame.solution("1D#2S*3S"));
        assertEquals(-4, dartGame.solution("1T2D3D#"));
        assertEquals(59, dartGame.solution("1D2S3T*"));
    }
}
