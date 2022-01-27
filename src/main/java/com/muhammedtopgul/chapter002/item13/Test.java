package com.muhammedtopgul.chapter002.item13;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 14:31
 */

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal original = new Animal(1, "Dog", 45);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        Animal copy = original.clone();

        System.out.println(original.getBreed());
        System.out.println(copy.getBreed());

        original.setBreed("Cat");
        original.setId(101);
        original.setFlag(6555);

        System.out.println(original.getBreed());
        System.out.println(copy.getBreed());

        while (!original.isEmpty())
            original.remove();
    }
}
