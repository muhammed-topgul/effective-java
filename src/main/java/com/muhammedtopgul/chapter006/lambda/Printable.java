package com.muhammedtopgul.chapter006.lambda;

/**
 * @author muhammed-topgul
 * @since 01.02.2022 23:42
 */

@FunctionalInterface
public interface Printable {

    void message();

    default void defaultMethod() {
        System.out.println("I am default");
    }

    static void staticMethod() {
        System.out.println("I am static");
    }

    private void privateMethod() {
        System.out.println("I am private ");
    }
}
