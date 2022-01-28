package com.muhammedtopgul.chapter003.item24;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 14:45
 */

public class InnerClasses {

    private static String staticString = "Static Field";
    private String memberString = "Member Field";

    public static class StaticNestedClass {
        public void print() {
            System.out.println(staticString);
            // System.out.println(memberString); DO NOT COMPILE

            System.out.println("I am StaticNestedClass");
        }
    }

    public class NonStaticClass {
        public void print() {
            System.out.println(staticString);
            System.out.println(memberString);

            System.out.println("I am NonStaticClass");
        }
    }

    public void localClass() {

        class LocalClass {
            public void print() {
                System.out.println(staticString);
                System.out.println(memberString);

                System.out.println("I am LocalClass");
            }
        }

        new LocalClass().print();
    }
}
