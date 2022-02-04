package org.example;

import junit.framework.TestCase;

public class PorkTest extends TestCase {

    public void testLikesWord() {
        Pork p = new Pork("Pork");
        assertTrue(p.likesWord("feed"));
        assertFalse(p.likesWord("final"));
    }
}