package org.example;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static boolean isVowel(char c) {
        List vowelsList=Arrays.asList(new Character[]{'a','e','i','o','u'});
        return (vowelsList.contains(c));
    }

    public static boolean isWord(String str) {
        WordList wl = new WordList();
        return wl.isKnownWord(str);
    }
}
