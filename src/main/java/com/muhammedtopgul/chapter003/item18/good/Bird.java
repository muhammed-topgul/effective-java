package com.muhammedtopgul.chapter003.item18.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:05
 */

public class Bird {

    private Flyable flyable;

    public Bird(Flyable flyable) {
        this.flyable = flyable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
