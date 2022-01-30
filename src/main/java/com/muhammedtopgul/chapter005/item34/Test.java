package com.muhammedtopgul.chapter005.item34;

import com.muhammedtopgul.chapter004.item31.A;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:34
 */

public class Test {

    public static final int APPLE_FUJI = 1;
    public static final int APPLE_PIPPIN = 2;
    public static final int APPLE_GRANNY_SMITH = 3;

    public static final int ORANGE_NAVEL = 1;
    public static final int ORANGE_TEMPLE = 2;
    public static final int ORANGE_BLOOD = 3;
    public static final int ORANGE_OTHER = 4;

    public enum Apple {
        FUJI, PIPPIN, GRANNY_SMITH;
    }

    public enum Orange {
        NAVEL, TEMPLE, BLOOD;
    }

    public static void main(String[] args) {
        printAppleName(Apple.GRANNY_SMITH);
    }

    public static void printAppleName(Apple apple) {
        String name;
        if (apple == Apple.FUJI)
            name = "Fuji";
        else if (apple == Apple.PIPPIN)
            name = "Pippin";
        else
            name = "Granny Smith";
        System.out.println(name);
    }

//    public static void printAppleName(int number) {
//        String name;
//        if (number == 1)
//            name = "Fuji";
//        else if (number == 2)
//            name = "Temple";
//        else
//            name = "Granny Smith";
//        System.out.println(name);
//    }
}
