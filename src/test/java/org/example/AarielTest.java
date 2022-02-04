package org.example;

import junit.framework.TestCase;

public class AarielTest extends TestCase {

    public void testLikesWord() {
        Aariel a = new Aariel();
        assertTrue(a.likesWord("aardvark"));
        assertFalse(a.likesWord("clairvoyance"));
    }
}