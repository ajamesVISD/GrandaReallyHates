package org.example;

public class Perrmatio extends Grandma {
    public Perrmatio(String name) {
        super("Perrmatio");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() < 2) {
            return false;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
    }

