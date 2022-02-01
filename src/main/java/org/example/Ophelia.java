package org.example;

public class Ophelia extends Grandma {
    public Ophelia() {
        super("Ophelia");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() > 0) {
            return (str.charAt(0) == 'o');
        }
        return false;
    }
}
