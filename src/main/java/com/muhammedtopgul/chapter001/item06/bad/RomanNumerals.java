package com.muhammedtopgul.chapter001.item06.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 15:15
 */

public class RomanNumerals {

    // Performance can be greatly improved!
    public static boolean isRomanNumeral(String string) {
        return string.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
