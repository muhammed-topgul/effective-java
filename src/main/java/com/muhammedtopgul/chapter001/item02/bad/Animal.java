package com.muhammedtopgul.chapter001.item02.bad;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 11:16
 */

class Animal {

    private String breed;
    private boolean isMammal;
    private boolean isMovingWithFeet;

    public Animal() {
    }

    public Animal(String breed) {
        this.breed = breed;
    }

    public Animal(String breed, boolean isMammal) {
        this(breed);
        this.isMammal = isMammal;
    }

    public Animal(String breed, boolean isMammal, boolean isMovingWithFeet) {
        this(breed, isMammal);
        this.isMovingWithFeet = isMovingWithFeet;
    }

    //
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isMovingWithFeet() {
        return isMovingWithFeet;
    }

    public void setMovingWithFeet(boolean isMovingWithFeet) {
        this.isMovingWithFeet = isMovingWithFeet;
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
