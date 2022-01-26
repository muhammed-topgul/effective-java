package com.muhammedtopgul.chapter001.item02.good;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 11:33
 */

class Animal {

    private String breed;
    private boolean isMammal;
    private boolean isMovingWithFeet;

    private Animal(String breed) {
        this.breed = breed;
    }

    private Animal(String breed, boolean isMammal, boolean isMovingWithFeet) {
        this.breed = breed;
        this.isMammal = isMammal;
        this.isMovingWithFeet = isMovingWithFeet;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isMovingWithFeet() {
        return isMovingWithFeet;
    }

    /**
     * Builder Design Pattern
     */
    public static Animal.AnimalBuilder builder(String breed) {
        return new Animal.AnimalBuilder(breed);
    }

    public static class AnimalBuilder {
        private String breed;
        private boolean isMammal;
        private boolean isMovingWithFeet;

        public AnimalBuilder(String breed) {
            this.breed = breed;
        }

        public AnimalBuilder isMammal(boolean isMammal) {
            this.isMammal = isMammal;
            return this;
        }

        public AnimalBuilder isMovingWithFeet(boolean isMovingWithFeet) {
            this.isMovingWithFeet = isMovingWithFeet;
            return this;
        }

        public Animal build() {
            return new Animal(this.breed, this.isMammal, this.isMovingWithFeet);
        }
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
