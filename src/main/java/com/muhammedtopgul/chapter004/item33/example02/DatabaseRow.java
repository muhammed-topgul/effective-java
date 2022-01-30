package com.muhammedtopgul.chapter004.item33.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:19
 */

public class DatabaseRow {

    private Map<Column<?>,  Object> columns = new HashMap<>();

    public <T> void putColumn(Column<T> type, T instance) {
        if (type == null)
            throw new NullPointerException("Type is null");

        columns.put(type, type.cast(instance));
    }

    public <T> T getColumn(Column<T> type) {
        return type.cast(columns.get(type));
    }
}
