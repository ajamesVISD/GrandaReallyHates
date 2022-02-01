package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Grandma grandma = new Gretchen();

        System.out.println("Hello, I'm Grandma " + grandma.getName());
        System.out.println("Guess a word and I will tell you if I like it or not:");
        Scanner scan = new Scanner(System.in);
        int guessLeft = 5;
        while (guessLeft > 0) {
            System.out.println("You have " + guessLeft + " guesses left");
            System.out.println("Guess a word: ");
            String str = scan.nextLine();
            if (grandma.likesWord(str)) {
                System.out.println("I like that word");
                guessLeft--;
            }
            else if (!knownWords.contains(str)) {
                System.out.println("I do not understand that word");
            }
            else {
                System.out.println("I hate that word");
                guessLeft--;

            }



        }



    }

    /**
     * This method should return true if the given String has consecutive letters that are the same.
     *
     * @param str -- the String in question.
     * @return true if str has any consecutive letters that are identical; false if not.
     */

}
