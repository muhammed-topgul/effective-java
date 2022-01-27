package com.muhammedtopgul.chapter002.item10_11_12.good;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 13:37
 */

public class AnimalWithOverrides {

    private int id;
    private String breed;

    public AnimalWithOverrides(int id, String breed) {
        this.id = id;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;

        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        AnimalWithOverrides _this = (AnimalWithOverrides) object;
        return _this.id == this.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "AnimalWithOverrides{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                '}';
    }
}
