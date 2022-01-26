package com.muhammedtopgul.chapter001.item05.bad;

import com.muhammedtopgul.chapter001.item05.Dictionary;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:23
 */

public class SpellCheckerWithSingleton {

    public static final SpellCheckerWithSingleton INSTANCE = new SpellCheckerWithSingleton();
    private static final Dictionary dictionary = new Dictionary("Turkish");

    private SpellCheckerWithSingleton() {
    }

    public boolean isValid() {
        return dictionary.toString().strip().length() > 0;
    }
}
