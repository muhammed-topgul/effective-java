package com.muhammedtopgul.chapter001.item03;

import java.util.HashMap;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 13:42
 */

public class LazyCache implements Cache<Object, Object> {

    private static LazyCache instance;
    private HashMap<Object, Object> map;

    private LazyCache() {
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

    public synchronized static LazyCache getInstance() {
        if (instance == null) {
            instance = new LazyCache();
        }
        return instance;
    }
}
