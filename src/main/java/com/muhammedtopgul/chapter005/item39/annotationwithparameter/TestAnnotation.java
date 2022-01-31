package com.muhammedtopgul.chapter005.item39.annotationwithparameter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 11:22
 */

class TestAnnotation {

    public static void main(String[] args) {
        int tests = 0;
        int passed = 0;

        try {
            Class<?> myClass = Class.forName("com.muhammedtopgul.chapter005.item39.annotationwithparameter.MyClass");
            for (Method declaredMethod : myClass.getDeclaredMethods()) {
                if (declaredMethod.isAnnotationPresent(ExceptionTest.class)) {
                    tests++;

                    try {
                        declaredMethod.invoke(null);
                        System.err.println(declaredMethod.getName() + "() passed. This is a failed also.");
                    } catch (InvocationTargetException e) {
                        Throwable throwable = e.getCause();
                        Class<? extends Throwable> exceptionClass = declaredMethod.getAnnotation(ExceptionTest.class).value();

                        if (exceptionClass.isInstance(throwable)) {
                            passed++;
                        } else {
                            System.err.println(declaredMethod.getName() + "() is failed.");
                        }

                    } catch (Exception e) {
                        System.out.println("Unknown exception.");
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Not found class.");
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + (tests - passed));

    }
}
