package com.muhammedtopgul.chapter001.item01.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:05
 */

public class AnimalWithConstructor {
    private String breed;
    private boolean isMammal;
    private boolean movingWithFeet;

    public AnimalWithConstructor(String breed, boolean isMammal, boolean movingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.movingWithFeet = movingWithFeet;
    }

    @Override
    public String toString() {
        return "AnimalWithConstructor{" +
                "breed='" + breed + '\'' +
                ", isMammal=" + isMammal +
                ", movingWithFeet=" + movingWithFeet +
                '}';
    }
}

class Cat extends AnimalWithConstructor {

    public Cat(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}

class Dog extends AnimalWithConstructor {

    public Dog(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}
