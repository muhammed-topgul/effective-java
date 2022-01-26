package com.muhammedtopgul.chapter001.item01.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:33
 */

public class Test {

    public static void main(String[] args) {
        Animal cat = Animal.getMammal("Van");
        Animal dog = Animal.getMammal("Kangal");
        Animal chicken = Animal.getNonMammalAndMovingWithFeet("Polish");
        Animal fish = Animal.getNonMammalAndMovingWithNonFeet("Molly");

        Cat tommy = Animal.getMammalAsCat("Van");
        Dog rinTinTin = Animal.getMammalAsDog("Kangal");

        System.out.println(tommy);
        System.out.println(rinTinTin);
        System.out.println(fish);
    }
}
