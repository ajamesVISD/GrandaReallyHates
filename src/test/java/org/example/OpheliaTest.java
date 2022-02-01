package org.example;

import junit.framework.TestCase;

public class OpheliaTest extends TestCase {
    public void testOpheliaLikesWord() {
        Grandma o = new Ophelia();
        assertTrue(o.likesWord("olive"));
        assertFalse(o.likesWord("taper"));
        assertFalse(o.likesWord(""));
    }
}