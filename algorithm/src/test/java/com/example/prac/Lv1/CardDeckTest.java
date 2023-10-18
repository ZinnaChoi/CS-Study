package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardDeckTest {
    @Test
    public void testSolution() {
        CardDeck cardDeck = new CardDeck();

        String[] cards1 = { "i", "drink", "water" };
        String[] cards2 = { "want", "to" };
        String[] goal = { "i", "want", "to", "drink", "water" };
        assertEquals("Yes", cardDeck.solution(cards1, cards2, goal));

        String[] cards3 = { "i", "water", "drink" };
        String[] cards4 = { "want", "to" };
        String[] goal2 = { "i", "want", "to", "drink", "water" };
        assertEquals("No", cardDeck.solution(cards3, cards4, goal2));
    }
}
