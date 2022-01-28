package com.muhammedtopgul.chapter003.item18.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:06
 */

public class Bee {

    private Flyable flyable;

    public Bee(Flyable flyable) {
        this.flyable = flyable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
