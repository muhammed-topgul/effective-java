package com.muhammedtopgul.chapter005.item41;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 11:16
 */

class MyClass {

    @Marker
    public static void method1() { // TEST SHOULD FAIL
    }

    @Marker
    public static void method2() {
    }

    @Marker
    public static void method3() {
    }

    public static void method4() { // NOT A TEST
    }

    @Marker
    public void method5() { // INVALID USE: method is not static.
    }

    @Marker
    public static void method6() {
    }

    @Marker
    public static void method7() { // TEST SHOULD FAIL
        throw new RuntimeException("Should not work");
    }

    @Marker
    public static void method8() {
    }
}
