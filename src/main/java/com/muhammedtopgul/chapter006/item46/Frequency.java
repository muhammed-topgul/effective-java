package com.muhammedtopgul.chapter006.item46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author muhammed-topgul
 * @since 07.02.2022 23:34
 */

public class Frequency {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("icon", "coin", "icon", "inco", "icon");
        badUsageOfStream(words);
        goodUsageOfStream(words);
    }

    public static void goodUsageOfStream(List<String> words) {
        Map<String, Long> frequency = words.stream().collect(groupingBy((var -> var.toLowerCase()), counting()));
        System.out.println(frequency);
    }

    public static void badUsageOfStream(List<String> words) {
        Map<String, Long> frequency = new HashMap<>();
        words.forEach(word -> {
            frequency.merge(word.toLowerCase(), 1L, (prev, one) -> prev + one);
        });
        System.out.println(frequency);
    }
}
