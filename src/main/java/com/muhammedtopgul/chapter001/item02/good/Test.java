package com.muhammedtopgul.chapter001.item02.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 11:43
 */

public class Test {

    public static void main(String[] args) {
        Animal animal0 = new Animal.AnimalBuilder("Fish").build();
        Animal animal1 = Animal.builder("Dog").build();
        Animal animal2 = Animal.builder("Cat").isMammal(true).isMovingWithFeet(true).build();

        System.out.println(animal0);
        System.out.println(animal1);
        System.out.println(animal2);
    }
}
