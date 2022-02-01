package org.example;

import junit.framework.TestCase;

public class BettyTest extends TestCase {

    public void testBettyLikesWord() {
        Grandma b = new Betty();
        assertTrue(b.likesWord("cheese"));
        assertFalse(b.likesWord("choice"));
    }
}