package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Game {
    WordList wordList;
    Map<String, Grandma> grandmaMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    Grandma currentGrandma;

    public Game(WordList wordList) {
        this.wordList = wordList;
        addGrandma(new Ophelia());
        addGrandma(new Esme());
    }

    public void run() {
        int numGuesses = 5;
        for(Grandma g : grandmaMap.values()) {
            System.out.println(g.getName());
        }
        Scanner scan = new Scanner(System.in);
        while(currentGrandma == null) {
            System.out.println("Which grandma do you choose?");
            String userChoice = scan.nextLine();
            if (grandmaMap.containsKey(userChoice)) {
                currentGrandma = grandmaMap.get(userChoice);
            } else {
                System.out.println("I'm sorry, I don't recognize " + userChoice + ".");
            }
        }
        System.out.println("Hello, my name is " + currentGrandma.getName() + ".");
        while(numGuesses > 0) {
            System.out.println("Tell me a word and I will tell you if I like it!");
            System.out.println("You have " + numGuesses + " guesses left!");
            String userWord = scan.nextLine();
            if(wordList.isKnownWord(userWord)) {
                if(currentGrandma.likesWord(userWord)) {
                    System.out.println("Yes, I like " + userWord + "!");
                } else {
                    System.out.println("No, I hate " + userWord + "!");
                    numGuesses--;
                }
            } else {
                System.out.println("What kind of a word is " + userWord + "?!");
            }
        }
        System.out.println("Looks like you ran out of guesses!");
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
