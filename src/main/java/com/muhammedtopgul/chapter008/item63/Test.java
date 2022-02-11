package com.muhammedtopgul.chapter008.item63;

/**
 * @author muhammed-topgul
 * @since 11.02.2022 15:32
 */

public class Test {

    public static void main(String[] args) {
        concatWithPlus();
//        concatWithMethod();
//        concatWithBuilder();
    }

    public static void concatWithPlus() {
        long start = System.nanoTime();
        String string = "";
        for (int i = 0; i < 1_250_000; i++) {
            string += "A";
        }
        long end = System.nanoTime();
        System.out.printf("concatWithPlus: %25d\n" , (end - start));
    }

    public static void concatWithMethod() {
        long start = System.nanoTime();
        String string = "";
        for (int i = 0; i < 1_250_000; i++) {
            string.concat("A");
        }
        long end = System.nanoTime();
        System.out.printf("concatWithMethod: %23d\n" , (end - start));
    }

    public static void concatWithBuilder() {
        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1_250_000; i++) {
            builder.append("A");
        }
        long end = System.nanoTime();
        System.out.printf("concatWithBuilder: %22d\n" , (end - start));
    }
}
