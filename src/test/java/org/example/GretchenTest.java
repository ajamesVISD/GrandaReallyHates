package org.example;

import junit.framework.TestCase;

public class GretchenTest extends TestCase {

    public void testGretchenLikesWord() {
        Grandma g = new Gretchen();
        assertTrue(g.likesWord("mississippi"));
        assertFalse(g.likesWord("cat"));
    }
}