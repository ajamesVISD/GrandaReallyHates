package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Game {
    WordList wordList;
    Map<String, Grandma> grandmaMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public Game(WordList wordList) {
        this.wordList = wordList;
        addGrandma(new Ophelia());
        addGrandma(new Vera());
        addGrandma(new Betty());
    }

    public void run() {
        int numGuesses = 5;
        for(Grandma g : grandmaMap.values()) {
            System.out.println(g.getName());
        }
    }

    public void addGrandma(Grandma g) {
        if(g.likesWord(g.getName().toLowerCase(Locale.ROOT))) {
            grandmaMap.put(g.getName(), g);
        } else {
            System.out.println("I cannot add "
                    + g.getName()
                    + " because she does not like her own name!");
        }
    }
}
