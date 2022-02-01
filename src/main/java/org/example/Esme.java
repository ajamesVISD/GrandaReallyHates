package org.example;

public class Esme extends Grandma {
    public Esme() {
        super("Esme");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
