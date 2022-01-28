package com.muhammedtopgul.chapter004.item30;

import java.util.HashSet;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 16:31
 */

public class Union {

    public static <E> Set<E> union(Set<E> set0, Set<E> set1) {
        Set<E> result = new HashSet<>(set0);
        result.addAll(set1);
        return result;
    }

    public static void main(String[] args) {
        Set<String> elements1 = Set.of("A", "B", "C", "F", "G");
        Set<String> elements2 = Set.of("E", "B", "G", "H", "A");

        Set<String> union = union(elements1, elements2);
        union.forEach(System.out::println);
    }
}
