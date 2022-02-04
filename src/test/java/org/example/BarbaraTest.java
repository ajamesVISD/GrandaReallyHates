package org.example;

import junit.framework.TestCase;

public class BarbaraTest extends TestCase {

    public void testBarbaraLikesWord() {
        Grandma b = new Barbara();
        assertTrue(b.likesWord("aardvark"));
        assertFalse(b.likesWord("durg"));
        assertFalse(b.likesWord("art"));
    }
}