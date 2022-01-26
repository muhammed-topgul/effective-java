package com.muhammedtopgul.chapter001.item01.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:06
 */

class Animal {

    public static Animal MAMMAL = new Animal("UNKNOWN", true, true);
    public static Animal NON_MAMMAL_AND_IS_MOVING_WITH_FEET = new Animal("UNKNOWN", false, true);
    public static Animal NON_MAMMAL_AND_IS_MOVING_WITH_NON_FEET = new Animal("UNKNOWN", false, false);

    private String breed;
    private boolean isMammal;
    private boolean isMovingWithFeet;

    protected Animal(String breed, boolean isMammal, boolean isMovingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.isMovingWithFeet = isMovingWithFeet;
    }

    public static Animal getMammal(String breed) {
        return new Animal(breed, true, true);
    }

    public static Animal getNonMammalAndMovingWithFeet(String breed) {
        return new Animal(breed, false, true);
    }

    public static Animal getNonMammalAndMovingWithNonFeet(String breed) {
        return new Animal(breed, false, false);
    }

    public static Cat getMammalAsCat(String breed) {
        return new Cat(breed, true, true);
    }

    public static Dog getMammalAsDog(String breed) {
        return new Dog(breed, true, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", isMammal=" + isMammal +
                ", isMovingWithFeet=" + isMovingWithFeet +
                '}';
    }
}

class Cat extends Animal {

    protected Cat(String breed, boolean isMammal, boolean isMovingWithFeet) {
        super(breed, isMammal, isMovingWithFeet);
    }
}

class Dog extends Animal {

    protected Dog(String breed, boolean isMammal, boolean isMovingWithFeet) {
        super(breed, isMammal, isMovingWithFeet);
    }
}
