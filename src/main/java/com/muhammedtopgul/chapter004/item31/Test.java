package com.muhammedtopgul.chapter004.item31;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 16:53
 */

public class Test {

    public static void main(String[] args) {

        /**
         * PECS -> Producer extend, Consumer super
         */

        // List<Object> objects = new ArrayList<String>(); DO NOT COMPILE

        // List<A> aList = new ArrayList<B>(); DO NOT COMPILE

        List<? extends A> aList1 = new ArrayList<A>();
        List<? extends A> bList1 = new ArrayList<B>();
        List<? extends A> cList1 = new ArrayList<C>();
        List<? extends A> dList1 = new ArrayList<D>();

        List<? super B> bList2 = new ArrayList<>();
        List<? super B> aList2 = new ArrayList<A>();
    }
}
