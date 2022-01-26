package com.muhammedtopgul.chapter001.item06.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 16:44
 */

public class Test {

    public static void main(String[] args) {

        long start = System.nanoTime();
        sumPrimitive();
        long end = System.nanoTime();
        System.out.println("Primitive Dif: " + (end - start));

        start = System.nanoTime();
        sumWrapper();
        end = System.nanoTime();
        System.out.println("Wrapper Dif:   " + (end - start));

        start = System.nanoTime();
        sumWrapper1();
        end = System.nanoTime();
        System.out.println("Wrapper Dif:   " + (end - start));

    }

    public static int sumPrimitive() {
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumWrapper() {
        Integer sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumWrapper1() {
        Integer sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
