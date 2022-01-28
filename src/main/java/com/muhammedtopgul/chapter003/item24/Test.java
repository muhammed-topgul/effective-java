package com.muhammedtopgul.chapter003.item24;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 14:47
 */

public class Test {

    public static void main(String[] args) {
        InnerClasses.StaticNestedClass staticNestedClass = new InnerClasses.StaticNestedClass();
        staticNestedClass.print();

        InnerClasses innerClasses = new InnerClasses();
        InnerClasses.NonStaticClass nonStaticClass = innerClasses.new NonStaticClass();
        nonStaticClass.print();

        innerClasses.localClass();

    }
}
