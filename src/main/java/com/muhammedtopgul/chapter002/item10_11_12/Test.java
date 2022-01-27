package com.muhammedtopgul.chapter002.item10_11_12;

import com.muhammedtopgul.chapter002.item10_11_12.bad.AnimalWithoutOverrides;
import com.muhammedtopgul.chapter002.item10_11_12.good.AnimalWithOverrides;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 13:29
 */

public class Test {

    public static void main(String[] args) {
        // testWithoutOverrides();
        testWithOverrides();
    }

    public static void testWithOverrides() {
        AnimalWithOverrides animal1 = new AnimalWithOverrides(1, "Cat");
        AnimalWithOverrides animal2 = new AnimalWithOverrides(1, "Cat");

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal2.equals(animal1));
        System.out.println(animal1.equals(null));

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());

        System.out.println(animal1);
    }

    public static void testWithoutOverrides() {
        AnimalWithoutOverrides animal1 = new AnimalWithoutOverrides(1, "Cat");
        AnimalWithoutOverrides animal2 = new AnimalWithoutOverrides(1, "Cat");

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());

        System.out.println(animal1);
    }
}
