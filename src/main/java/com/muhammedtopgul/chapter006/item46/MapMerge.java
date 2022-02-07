package com.muhammedtopgul.chapter006.item46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author muhammed-topgul
 * @since 07.02.2022 23:40
 */

public class MapMerge {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("icon", "coin", "icon", "inco", "coin");
        solution1(words);
        solution2(words);
        solution3(words);
        solution4(words);
        solution5(words);
    }

    public static void solution1(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();

        words.forEach(word -> {
            Integer prev = frequency.get(word);
            if (prev == null) {
                frequency.put(word, 1);
            } else {
                frequency.put(word, prev + 1);
            }
        });

        System.out.println(frequency);
    }

    public static void solution2(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();

        words.forEach(word -> {
            frequency.putIfAbsent(word, 0);
            frequency.put(word, frequency.get(word) + 1);
        });

        System.out.println(frequency);
    }

    public static void solution3(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();

        words.forEach(word -> {
            frequency.putIfAbsent(word, 0);
            frequency.computeIfPresent(word, (w, prev) -> prev + 1);
        });

        System.out.println(frequency);
    }

    public static void solution4(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();

        words.forEach(word -> {
            frequency.compute(word, (w, prev) -> prev != null ? prev + 1 : 1);
        });

        System.out.println(frequency);
    }

    public static void solution5(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();

        words.forEach(word ->
                frequency.merge(word, 1, (prev, one) -> prev + one)
        );

        System.out.println(frequency);
    }
}
