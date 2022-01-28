package com.muhammedtopgul.chapter004.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 16:11
 */

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    public E popWell() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;  // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        stack.push("Java");
        stack.push("Hibernate");
        stack.push("Spring");

        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
}
