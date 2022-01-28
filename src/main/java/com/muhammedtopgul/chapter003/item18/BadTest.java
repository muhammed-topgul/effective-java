package com.muhammedtopgul.chapter003.item18;

import com.muhammedtopgul.chapter003.item18.bad.*;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:06
 */

public class BadTest {

    public static void main(String[] args) {

        Flyable bird = new Bird(2, true);
        Flyable bee = new Bee(4, false);

        Flyable plane = new Plane(2, true);
        Flyable helicopter = new Helicopter(0, true);


    }
}
