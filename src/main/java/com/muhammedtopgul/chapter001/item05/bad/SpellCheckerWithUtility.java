package com.muhammedtopgul.chapter001.item05.bad;

import com.muhammedtopgul.chapter001.item05.Dictionary;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:21
 */

public class SpellCheckerWithUtility {

    private static final Dictionary dictionary = new Dictionary("Turkish");

    private SpellCheckerWithUtility() {
    }

    public static boolean isValid() {
        return dictionary.toString().strip().length() > 0;
    }
}
