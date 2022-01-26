package com.muhammedtopgul.chapter001.item03;

import java.util.HashMap;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 13:42
 */

public class EagerCache implements Cache<Object, Object> {

    private static final EagerCache instance = new EagerCache();
    private HashMap<Object, Object> map;

    private EagerCache() {
        map = new HashMap<>();
    }

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static EagerCache getInstance() {
        return instance;
    }
}
