package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Game game = new Game(new WordList());
        game.run();
    }
}
