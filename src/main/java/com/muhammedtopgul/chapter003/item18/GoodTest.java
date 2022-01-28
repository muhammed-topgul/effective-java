package com.muhammedtopgul.chapter003.item18;

import com.muhammedtopgul.chapter003.item18.good.*;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:12
 */

public class GoodTest {

    public static void main(String[] args) {
        Bird bird = new Bird(new Flyable(2, true));
        Bee bee = new Bee(new Flyable(4, false));

        Plane plane = new Plane(new Flyable(2, true));
        Helicopter helicopter = new Helicopter(new Flyable(0, true));
    }
}
