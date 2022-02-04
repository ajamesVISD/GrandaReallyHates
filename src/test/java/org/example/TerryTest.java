package org.example;

import junit.framework.TestCase;

public class TerryTest extends TestCase {

    public void testLikesWord() {
        Terry t = new Terry();
        assertTrue(t.likesWord("today"));
        assertFalse(t.likesWord("totally"));
    }
}