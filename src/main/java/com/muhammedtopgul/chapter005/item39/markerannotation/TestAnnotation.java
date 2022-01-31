package com.muhammedtopgul.chapter005.item39.markerannotation;

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
            Class<?> myClass = Class.forName("com.muhammedtopgul.chapter005.item39.markerannotation.MyClass");
            for (Method declaredMethod : myClass.getDeclaredMethods()) {
                if (declaredMethod.isAnnotationPresent(Test.class)) {
                    tests++;

                    try {
                        declaredMethod.invoke(null);
                        passed++;
                    } catch (InvocationTargetException | IllegalAccessException | NullPointerException e) {
                        System.err.println(declaredMethod.getName() + " is failed.");
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
