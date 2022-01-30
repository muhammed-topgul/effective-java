package com.muhammedtopgul.chapter004.item32;

import java.util.List;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 21:45
 */

public class Dangerous {

    public static void main(String[] args) {
        dangerous(List.of("There be dragons!"));
    }

    public static void dangerous(List<String>... stringList) {
        List<Integer> integerList = List.of(42);
        Object[] objects = stringList;
        objects[0] = integerList; // Heap Pollution

        String s = stringList[0].get(0); // ClassCastException
    }
}
