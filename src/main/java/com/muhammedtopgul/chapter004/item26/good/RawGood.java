package com.muhammedtopgul.chapter004.item26.good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 15:25
 */

public class RawGood {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(54));

        String s = strings.get(0);
    }

    public static void unsafeAdd(List<String> list, Object object) {
        list.add(String.valueOf(object));
    }
}
