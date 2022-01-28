package com.muhammedtopgul.chapter003.item19;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:24
 */

public class Parent {

    public Parent() {
        System.out.println(":::PARENT:::");
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("I am in PARENT.");
    }
}
