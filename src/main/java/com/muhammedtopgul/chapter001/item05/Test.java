package com.muhammedtopgul.chapter001.item05;

import com.muhammedtopgul.chapter001.item05.bad.SpellCheckerWithSingleton;
import com.muhammedtopgul.chapter001.item05.bad.SpellCheckerWithUtility;
import com.muhammedtopgul.chapter001.item05.good.SpellCheckerWithDI;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 14:34
 */

public class Test {

    public static void main(String[] args) {
        System.out.println(SpellCheckerWithUtility.isValid());
        System.out.println(SpellCheckerWithSingleton.INSTANCE.isValid());
        System.out.println("\n");

        System.out.println(new SpellCheckerWithDI(new Dictionary("turkish")).isValid());
        System.out.println(new SpellCheckerWithDI(new Dictionary("english")).isValid());
        System.out.println(new SpellCheckerWithDI(new Dictionary("french")).isValid());
    }
}
