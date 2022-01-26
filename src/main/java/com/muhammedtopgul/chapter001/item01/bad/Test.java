package com.muhammedtopgul.chapter001.item01.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:09
 */

public class Test {

    public static void main(String[] args) {

        Animal cat = new Animal("Van", true, true);
        Animal dog = new Animal("Kangal", true, true);
        Animal chicken = new Animal("Polish", false, true);
        Animal fish = new Animal("Molly", false, false);

        Animal tommy = new Cat("Van", true, true);
        Animal rinTinTin = new Dog("Kangal", true, true);

        System.out.println(cat);
    }
}
