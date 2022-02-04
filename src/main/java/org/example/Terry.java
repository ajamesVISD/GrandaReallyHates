package org.example;

public class Terry extends Grandma {
    public Terry() {
        super("Terry");
    }

    @Override
    public boolean likesWord(String str) {
        return (str.length() == 5);

}}
