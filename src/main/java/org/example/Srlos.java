package org.example;

public class Srlos extends Grandma {
    public Srlos(String name) {
        super("Srlos");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() < 2) {
            return false;
        }
        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
