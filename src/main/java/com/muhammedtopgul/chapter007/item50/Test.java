package com.muhammedtopgul.chapter007.item50;

import java.util.Date;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 21:32
 */

public class Test {

    public static void main(String[] args) {
        mutable();
        System.out.println();
        immutable();
    }

    public static void immutable() {
        Date start = new Date();
        Date end = new Date();

        ImmutablePeriod period = new ImmutablePeriod(start, end);
        end.setYear(78);
        System.out.println(period);
        System.out.println(period.getEnd());
    }

    public static void mutable() {
        Date start = new Date();
        Date end = new Date();

        MutablePeriod period = new MutablePeriod(start, end);
        end.setYear(78);
        System.out.println(period);
    }
}
