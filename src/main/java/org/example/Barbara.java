package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Barbara extends Grandma {
    public Barbara() {
        super("Barbara");
    }

    @Override
    public boolean likesWord(String str) {
        Matcher matcher = Pattern.compile("ar").matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
