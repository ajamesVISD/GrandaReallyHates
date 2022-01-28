package org.example;

public abstract class Grandma {
    String name;

    public Grandma(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean likesWord(String str);
}



