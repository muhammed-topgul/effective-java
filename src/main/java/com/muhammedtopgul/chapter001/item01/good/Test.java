package com.muhammedtopgul.chapter001.item01.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:33
 */

public class Test {

    public static void main(String[] args) {
        AnimalWithStaticFactory cat = AnimalWithStaticFactory.getMammal("Van");
        AnimalWithStaticFactory dog = AnimalWithStaticFactory.getMammal("Kangal");
        AnimalWithStaticFactory chicken = AnimalWithStaticFactory.getNonMammalAndMovingWithFeet("Polish");
        AnimalWithStaticFactory fish = AnimalWithStaticFactory.getNonMammalAndMovingWithNonFeet("Molly");

        Cat tommy = AnimalWithStaticFactory.getMammalAsCat("Van");
        Dog rinTinTin = AnimalWithStaticFactory.getMammalAsDog("Kangal");

        System.out.println(tommy);
        System.out.println(rinTinTin);
        System.out.println(fish);
    }
}
