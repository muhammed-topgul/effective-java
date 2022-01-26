package com.muhammedtopgul.chapter001.item03;

import java.util.HashMap;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 13:51
 */

public enum EnumCache implements Cache<Object, Object> {

    INSTANCE;

    private HashMap<Object, Object> map = new HashMap<>();

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
}
