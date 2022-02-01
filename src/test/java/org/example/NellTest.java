package org.example;

import junit.framework.TestCase;

public class NellTest extends TestCase {

    public void testNellLikesWord() {
        Grandma n = new Nell();
        assertTrue(n.likesWord("bell"));
        assertFalse(n.likesWord("aardvark"));
    }
}