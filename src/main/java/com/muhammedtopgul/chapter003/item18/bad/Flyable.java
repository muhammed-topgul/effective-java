package com.muhammedtopgul.chapter003.item18.bad;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:03
 */

public abstract class Flyable {

    private int wingCount;
    private boolean hasTail;

    public Flyable(int wingCount, boolean hasTail) {
        this.wingCount = wingCount;
        this.hasTail = hasTail;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
