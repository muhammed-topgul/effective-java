package com.muhammedtopgul.chapter003.item17.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 10:43
 */

public class ImmutableBuilder {

    public static int createdClassCount = 0;

    private int value;

    public ImmutableBuilder(int value) {
        ++createdClassCount;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ImmutableClass toImmutableClass() {
        return new ImmutableClass(this.value);
    }
}
