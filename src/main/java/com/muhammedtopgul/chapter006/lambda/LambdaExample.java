package com.muhammedtopgul.chapter006.lambda;

/**
 * @author muhammed-topgul
 * @since 01.02.2022 23:45
 */

public class LambdaExample {

    public static void main(String[] args) {
        method(() -> System.out.println("Hello, World!"));
    }

    public static void method(Printable printable) {
        printable.message();
    }
}
