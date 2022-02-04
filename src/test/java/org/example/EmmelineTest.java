package org.example;

import junit.framework.TestCase;

public class EmmelineTest extends TestCase {

    public void testEmmelineLikesWord() {
        Grandma e = new Emmeline();
        assertTrue(e.likesWord("cheese"));
        assertFalse(e.likesWord("choice"));
    }
}