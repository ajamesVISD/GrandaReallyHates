package org.example;

public class Gertrude extends Grandma {
    public Gertrude() {
        super("Gertrude");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() < 2) {
            return false;
        }
        return str.charAt(0) == 'g';
    }
}
