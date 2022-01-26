package com.muhammedtopgul.chapter001.item02.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 11:18
 */

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Van");
        Animal animal2 = new Animal("Molly", false, false);
        Animal animal3 = new Animal("Polish", false);


        Animal animal0 = new Animal();
        animal0.setBreed("Molly");

        System.out.println(animal0);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
