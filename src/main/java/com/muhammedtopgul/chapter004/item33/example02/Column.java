package com.muhammedtopgul.chapter004.item33.example02;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:17
 */

public class Column<T> {

    private final Class<T> type;

    public Column(Class<T> type) {
        this.type = type;
    }

    public T cast(Object object) {
        return object == null ? null : type.cast(object);
    }
}
