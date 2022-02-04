package org.example;

import junit.framework.TestCase;

public class PerrmatioTest extends TestCase {

    public void testLikesWord() {
        Perrmatio p = new Perrmatio("Perrmatio");
        assertTrue(p.likesWord("terrible"));
        assertFalse(p.likesWord("catch"));
    }
}