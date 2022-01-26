package com.muhammedtopgul.chapter001.item01.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:09
 */

public class Test {

    public static void main(String[] args) {

        AnimalWithConstructor cat = new AnimalWithConstructor("Van", true, true);
        AnimalWithConstructor dog = new AnimalWithConstructor("Kangal", true, true);
        AnimalWithConstructor chicken = new AnimalWithConstructor("Polish", false, true);
        AnimalWithConstructor fish = new AnimalWithConstructor("Molly", false, false);

        AnimalWithConstructor tommy = new Cat("Van", true, true);
        AnimalWithConstructor rinTinTin = new Dog("Kangal", true, true);

        System.out.println(cat);
    }
}
