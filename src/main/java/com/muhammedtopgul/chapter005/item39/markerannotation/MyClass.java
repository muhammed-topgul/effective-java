package com.muhammedtopgul.chapter005.item39.markerannotation;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 11:16
 */

class MyClass {

    @Test
    public static void method1() { // TEST SHOULD FAIL
    }

    @Test
    public static void method2() {
    }

    @Test
    public static void method3() {
    }

    public static void method4() { // NOT A TEST
    }

    @Test
    @Deprecated(since = "Since now.", forRemoval = true)
    public void method5() { // INVALID USE: method is not static.
    }

    @Test
    public static void method6() {
    }

    @Test
    public static void method7() { // TEST SHOULD FAIL
        throw new RuntimeException("Should not work");
    }

    @Test
    public static void method8() {
    }
}
