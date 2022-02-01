package org.example;

public class Anna extends Grandma {
    public Anna() {
        super("Anna");
    }

    @Override
    public boolean likesWord(String str) {
        StringBuffer strReversed = new StringBuffer(str);
        String pallendrome = strReversed.reverse().toString();
        if(str.equals(pallendrome)) {
            return true;
        }
        return false;
    }
}
