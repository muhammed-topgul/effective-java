package com.muhammedtopgul.chapter003.item17;

import com.muhammedtopgul.chapter003.item17.bad.MutableClass;
import com.muhammedtopgul.chapter003.item17.good.ImmutableBuilder;
import com.muhammedtopgul.chapter003.item17.good.ImmutableClass;

import java.util.Date;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 10:20
 */

public class Test {

    public static void main(String[] args) {
        // immutableTest();
        // mutableTest();

        int[] array = {1, 2, 3, 4, 5};

        // BAD PRACTICE
        // badPractice(array);


        // BEST PRACTICE
        bestPractice(array);

    }

    public static void bestPractice(int[] array) {
        int sum = 0;
        ImmutableBuilder builder = new ImmutableBuilder(sum);
        for (int i : array) {
            sum += i;
            builder.setValue(sum);
        }

        System.out.println("Count: " + builder.toImmutableClass().getValue());
        System.out.println("Created Class Count: " + ImmutableClass.createdClassCount);
    }

    public static void badPractice(int[] array) {
        int sum = 0;
        ImmutableClass immutableClass = new ImmutableClass(sum);

        for (int i : array) {
            sum += i;
            immutableClass = new ImmutableClass(sum);
        }
        System.out.println("Count: " + immutableClass.getValue());
        System.out.println("Created Class Count: " + ImmutableClass.createdClassCount);
    }

    public static void immutableTest() {
        // Immutable
        String name = new String("Java");
        name.toLowerCase();
        System.out.println(name);
    }

    public static void mutableTest() {
        // Mutable
        Date date = new Date();
        date.setDate(3);
        System.out.println(date);
    }
}
