package com.muhammedtopgul.chapter003.item17.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 10:26
 */

public final class ImmutableClass {

    public static int createdClassCount = 0;

    private final int value;

    public ImmutableClass(int value) {
        ++createdClassCount;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
