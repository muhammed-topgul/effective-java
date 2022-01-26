package com.muhammedtopgul.chapter001.item01.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:06
 */

class Animal {

    public static Animal MAMMAL = new Animal("UNKNOWN", true, true);
    public static Animal NON_MAMMAL_AND_MOVING_WITH_FEET = new Animal("UNKNOWN", false, true);
    public static Animal NON_MAMMAL_AND_MOVING_WITH_NON_FEET = new Animal("UNKNOWN", false, false);

    private String breed;
    private boolean isMammal;
    private boolean movingWithFeet;

    protected Animal(String breed, boolean isMammal, boolean movingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.movingWithFeet = movingWithFeet;
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
                ", movingWithFeet=" + movingWithFeet +
                '}';
    }
}

class Cat extends Animal {

    protected Cat(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}

class Dog extends Animal {

    protected Dog(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}
