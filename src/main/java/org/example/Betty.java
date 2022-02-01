package org.example;

public class Betty extends Grandma {
    public Betty() {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {
        return hasDoubleLetters(str);
    }

    private boolean hasDoubleLetters(String str) {
        if (str.length()<2) {
            return false;
        }
        for(int i = 1; i<str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                return true;
            }

        }
        return false;
    }
}
