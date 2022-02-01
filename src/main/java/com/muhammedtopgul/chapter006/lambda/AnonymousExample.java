package com.muhammedtopgul.chapter006.lambda;

/**
 * @author muhammed-topgul
 * @since 01.02.2022 23:43
 */

public class AnonymousExample {

    public static void main(String[] args) {
        method(new Printable() {
            @Override
            public void message() {
                System.out.println("Hello, World!");
            }
        });


        Printable printable = new Printable() {
            @Override
            public void message() {
                System.out.println("Hello, World!");
            }
        };

        printable.message();
    }

    public static void method(Printable printable) {
        printable.message();
    }
}
