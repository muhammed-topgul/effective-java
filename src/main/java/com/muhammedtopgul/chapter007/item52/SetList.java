package com.muhammedtopgul.chapter007.item52;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 22:04
 */

public class SetList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        System.out.println(set);
        System.out.println(list);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            // list.remove(i);
            list.remove((Integer) i);
        }

        System.out.println(set);
        System.out.println(list);
    }
}
