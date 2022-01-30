package com.muhammedtopgul.chapter004.item32;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 21:55
 */

public class FlattenWithVarargs {

    public static void main(String[] args) {
        List<Integer> flatList = flatten(List.of(1, 2), List.of(3, 4, 5), List.of(6, 7));
        System.out.println(flatList);
    }

    @SafeVarargs
    public static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
}
