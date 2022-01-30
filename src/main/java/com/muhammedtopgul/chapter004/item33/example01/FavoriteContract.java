package com.muhammedtopgul.chapter004.item33.example01;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:03
 */

public interface FavoriteContract {

    <T> void putFavorite(Class<T> type, T instance);

    <T> T getFavorite(Class<T> type);
}
