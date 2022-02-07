package com.muhammedtopgul.chapter006.item48;

import java.util.stream.IntStream;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 00:32
 */

public class Test {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(var -> System.out.print(var + " "));
        System.out.println();
        IntStream.range(0, 10).parallel().forEach(var -> System.out.print(var + " "));
    }
}
