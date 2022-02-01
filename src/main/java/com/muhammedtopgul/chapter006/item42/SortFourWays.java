package com.muhammedtopgul.chapter006.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 01.02.2022 23:53
 */

public class SortFourWays {

    public static void main(String[] args) {
        String[] namesArray = {"Lawrence", "Adriano", "Cindy", "Fred", "Micheal", "Dan", "Bill", "Emily", "Sunny"};
        List<String> namesList = Arrays.asList(namesArray);

        // Solution with anonymous class
        System.out.println("Before: " + namesList);
        Collections.sort(namesList, new Comparator<String>() {
            @Override
            public int compare(String var0, String var1) {
                return Integer.compare(var0.length(), var1.length());
            }
        });
        print(namesList);



        // Solutions with Lambda
        System.out.println("Before: " + namesList);
        Collections.sort(namesList, (var0, var1) -> Integer.compare(var0.length(), var1.length()));
        print(namesList);


        System.out.println("Before: " + namesList);
        Collections.sort(namesList, Comparator.comparingInt(String::length));
        print(namesList);


        System.out.println("Before: " + namesList);
        namesList.sort((var0, var1) -> Integer.compare(var0.length(), var1.length()));
        print(namesList);


        System.out.println("Before: " + namesList);
        namesList.sort(Comparator.comparingInt(String::length));
        print(namesList);
    }

    public static void print(List<String> list) {
        for (String s : list) {
            System.out.printf("After:  %s(%d)  ", s, s.length());
        }
        Collections.shuffle(list);
        System.out.println("\n");
    }
}
