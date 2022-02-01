package org.example;

import junit.framework.TestCase;

public class AnnaTest extends TestCase {

    public void testAnnaLikesWord() {
        Grandma a = new Anna();
        assertTrue(a.likesWord("kayak"));
        assertFalse(a.likesWord("potato"));
    }
}