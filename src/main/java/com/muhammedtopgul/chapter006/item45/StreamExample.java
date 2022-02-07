package com.muhammedtopgul.chapter006.item45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author muhammed-topgul
 * @since 07.02.2022 23:04
 */

public class StreamExample {

    public static void main(String[] args) {
        List<String> frameworks = Arrays.asList("Spring", "Hibernate", "JPA", "Vaadin", "JSP", "JSF");

        frameworks.stream()
                .filter(var -> var.startsWith("J"))
                .map(String::toLowerCase)
                .forEach(System.out::println);

        System.out.println("\n");

        Arrays.stream(new int[]{1, 2})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\n");

        IntStream.range(0, 5)
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println(IntStream.range(0, 5).max().getAsInt());
    }
}
