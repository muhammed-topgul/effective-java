package com.muhammedtopgul.chapter001.item01.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:05
 */

class Animal {
    private String breed;
    private boolean isMammal;
    private boolean isMovingWithFeet;

    public Animal(String breed, boolean isMammal, boolean isMovingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.isMovingWithFeet = isMovingWithFeet;
    }

    @Override
    public String toString() {
        return "AnimalWithConstructor{" +
                "breed='" + breed + '\'' +
                ", isMammal=" + isMammal +
                ", isMovingWithFeet=" + isMovingWithFeet +
                '}';
    }
}

class Cat extends Animal {

    public Cat(String breed, boolean isMammal, boolean isMovingWithFeet) {
        super(breed, isMammal, isMovingWithFeet);
    }
}

class Dog extends Animal {

    public Dog(String breed, boolean isMammal, boolean isMovingWithFeet) {
        super(breed, isMammal, isMovingWithFeet);
    }
}
