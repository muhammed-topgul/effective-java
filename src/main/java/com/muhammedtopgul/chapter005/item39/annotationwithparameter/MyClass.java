package com.muhammedtopgul.chapter005.item39.annotationwithparameter;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 11:33
 */

class MyClass {

    @ExceptionTest(ArithmeticException.class)
    public static void method1() { // Test should pass.
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method2() { // Test should fall.
        int[] a = new int[0];
        int i = a[0];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method3() { // Test should fall, no exception.
    }
}
