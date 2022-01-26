package com.muhammedtopgul.chapter001.item03;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 13:40
 */

public interface Cache<K, V> {

    void put(K key, V value);
    V get(K key);
}
