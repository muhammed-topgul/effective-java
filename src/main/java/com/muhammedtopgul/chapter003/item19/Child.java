package com.muhammedtopgul.chapter003.item19;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 11:25
 */

public class Child extends Parent {

    private String message = "UNSET";

    public Child(String message) {
        System.out.println(":::CHILD:::");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void overrideMe() {
        System.out.println(this.message);
    }
}
