package com.muhammedtopgul.chapter003.item17.bad;

import com.muhammedtopgul.chapter003.item17.good.ImmutableClass;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 10:28
 */

public class MutableClass {

    private int readValue;

    public MutableClass(int value) {
        this.readValue = value;
    }

    public int getValue() {
        return this.readValue;
    }

    public void setValue(int value) {
        this.readValue = value;
    }
}
