package org.example;

public class Nell extends Grandma {
    public Nell() {
        super("Nell");
    }

    @Override
    public boolean likesWord(String str) {
        if ( 'e'== str.charAt(str.length() - 3) && 'l'== str.charAt(str.length() - 2) && 'l'== str.charAt(str.length() - 1)) {
            return true;

        }
        return false;
    }
}
