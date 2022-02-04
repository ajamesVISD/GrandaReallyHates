package org.example;

public class Emmeline extends Grandma {
    public Emmeline() {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
