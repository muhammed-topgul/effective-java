package com.muhammedtopgul.chapter001.item01.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 10:06
 */

class AnimalWithStaticFactory {

    public static AnimalWithStaticFactory MAMMAL = new AnimalWithStaticFactory("UNKNOWN", true, true);
    public static AnimalWithStaticFactory NON_MAMMAL_AND_MOVING_WITH_FEET = new AnimalWithStaticFactory("UNKNOWN", false, true);
    public static AnimalWithStaticFactory NON_MAMMAL_AND_MOVING_WITH_NON_FEET = new AnimalWithStaticFactory("UNKNOWN", false, false);

    private String breed;
    private boolean isMammal;
    private boolean movingWithFeet;

    protected AnimalWithStaticFactory(String breed, boolean isMammal, boolean movingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.movingWithFeet = movingWithFeet;
    }

    public static AnimalWithStaticFactory getMammal(String breed) {
        return new AnimalWithStaticFactory(breed, true, true);
    }

    public static AnimalWithStaticFactory getNonMammalAndMovingWithFeet(String breed) {
        return new AnimalWithStaticFactory(breed, false, true);
    }

    public static AnimalWithStaticFactory getNonMammalAndMovingWithNonFeet(String breed) {
        return new AnimalWithStaticFactory(breed, false, false);
    }

    public static Cat getMammalAsCat(String breed) {
        return new Cat(breed, true, true);
    }

    public static Dog getMammalAsDog(String breed) {
        return new Dog(breed, true, true);
    }

    @Override
    public String toString() {
        return "AnimalWithStaticFactory{" +
                "breed='" + breed + '\'' +
                ", isMammal=" + isMammal +
                ", movingWithFeet=" + movingWithFeet +
                '}';
    }
}

class Cat extends AnimalWithStaticFactory {

    protected Cat(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}

class Dog extends AnimalWithStaticFactory {

    protected Dog(String breed, boolean isMammal, boolean movingWithFeet) {
        super(breed, isMammal, movingWithFeet);
    }
}
