package org.example;

import junit.framework.TestCase;

public class EsmeTest extends TestCase {

    public void testEsmeLikesWord() {
        Esme e = new Esme();
        assertTrue(e.likesWord("treat"));
        assertFalse(e.likesWord("elbow"));
        assertFalse(e.likesWord(""));
    }
}