package com.muhammedtopgul.chapter001.item04;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:11
 */

public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError("Cannot instantiate.");
    }

    public static void utilityMethod1() {
        System.out.println("Utility 1");
    }

    public static void utilityMethod2() {
        System.out.println("Utility 2");
    }
}
