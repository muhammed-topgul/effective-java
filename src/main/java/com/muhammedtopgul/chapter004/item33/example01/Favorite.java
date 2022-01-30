package com.muhammedtopgul.chapter004.item33.example01;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 22:05
 */

public class Favorite implements FavoriteContract {

    private final Map<Class<?>, Object> favorites = new HashMap<>();

    @Override
    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));
    }

    @Override
    public <T> T getFavorite(Class<T> type) {
         return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        FavoriteContract favoriteContract = new Favorite();
        favoriteContract.putFavorite(String.class, "Java");
        favoriteContract.putFavorite(String.class, "SE");
        favoriteContract.putFavorite(Integer.class, 153);

        System.out.println(favoriteContract.getFavorite(String.class));
    }
}
