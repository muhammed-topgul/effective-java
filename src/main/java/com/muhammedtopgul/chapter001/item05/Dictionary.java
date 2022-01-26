package com.muhammedtopgul.chapter001.item05;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:21
 */

public class Dictionary {

    private final String language;

    public Dictionary(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        System.out.println("Lang: " + this.language);
        return this.language;
    }
}
