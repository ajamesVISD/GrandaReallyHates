package org.example;

public class Pork extends Grandma {
    public Pork(String name) {
        super("Pork");
    }

    @Override
    public boolean likesWord(String str) {
        return(str.length() == 4);
    }
}
