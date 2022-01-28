package com.muhammedtopgul.chapter004.item26.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 15:25
 */

public class RawBad {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(54));

        String s = strings.get(0); // java.lang.ClassCastException
    }

    public static void unsafeAdd(List list, Object object) {
        list.add(object);
    }
}
