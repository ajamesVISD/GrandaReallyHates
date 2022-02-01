package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class WordList<knownWords> {

    List<String> knownWords;
    //This code below will populate the knownWords list with about 27,000 English words.

    public WordList() {
        knownWords = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isKnownWord(String str) {
        return knownWords.contains(str);
    }
}
