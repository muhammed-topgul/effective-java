package com.muhammedtopgul.chapter001.item05.good;

import com.muhammedtopgul.chapter001.item05.Dictionary;

import java.util.Objects;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:24
 */

public class SpellCheckerWithDI {

    private final Dictionary dictionary;

    public SpellCheckerWithDI(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid() {
        return dictionary.toString().strip().length() > 0;
    }
}
