package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static List<String> knownWords;

    public static void start() {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            Scanner scan = new Scanner(System.in);
            Grandma grandma = new Aariel();
            int guessesLeft = 5;
            System.out.println("Hello, my name is " + grandma.getName());
            while(guessesLeft > 0) {
                System.out.println("Give me a word and I'll tell you if I like it or hate it.");
                String userGuess = scan.nextLine();
                if(grandma.likesWord(userGuess)){
                    System.out.println("Yes, I like that word!");
                }
                else {
                    System.out.println("I hate that word.");
                    guessesLeft--;
                    System.out.println("You have " + guessesLeft + " guesses left.");
                }
            }

    }
}
