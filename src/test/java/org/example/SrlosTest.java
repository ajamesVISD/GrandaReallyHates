package org.example;

import junit.framework.TestCase;

public class SrlosTest extends TestCase {

    public void testLikesWord() {
        Srlos s = new Srlos("Srlos");
        assertTrue(s.likesWord("tact"));
        assertFalse(s.likesWord("today"));

    }
}