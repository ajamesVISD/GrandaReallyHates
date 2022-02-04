package org.example;

public class Aariel extends Grandma {
    public Aariel() {
        super("Aariel");
    }

    @Override
    public boolean likesWord(String str) {
        return (str.charAt(2) == 'r');
        }
    }
