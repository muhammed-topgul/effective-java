package com.muhammedtopgul.chapter001.item06.good;

import java.util.regex.Pattern;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 15:15
 */

public class RomanNumerals {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    // Performance can be greatly improved!
    public static boolean isRomanNumeral(String string) {
        // return string.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
        return ROMAN.matcher(string).matches();
    }
}
