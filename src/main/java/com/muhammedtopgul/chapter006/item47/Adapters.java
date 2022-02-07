package com.muhammedtopgul.chapter006.item47;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 00:22
 */

public class Adapters {

    public static void main(String[] args) {
        Adapters adapters = new Adapters();

        adapters.asList().forEach(System.out::println);

        System.out.println("\n");

        adapters.limit(2).forEach(System.out::println);
    }

    public static Stream<String> userNames() {
        List<String> userNames = new ArrayList<>();
        userNames.add("john");
        userNames.add("smith");
        userNames.add("tom");
        return userNames.stream();
    }

    public List<String> asList() {
        return userNames().collect(Collectors.toList());
    }

    public Set<String> asSet() {
        return userNames().collect(Collectors.toSet());
    }

    public Stream<String> filterByLength(int length) {
        return userNames().filter(var -> var.length() > length);
    }

    public Stream<String> sort() {
        return userNames().sorted();
    }

    public Stream<String> limit(int limit) {
        return userNames().limit(limit);
    }
}
