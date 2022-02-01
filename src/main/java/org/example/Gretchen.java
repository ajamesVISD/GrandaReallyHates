package org.example;

public class Gretchen extends Grandma {
    public Gretchen() {
        super("Gretchen");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() >= 8 ) {
            return true;
        }
        return false;
    }
}
