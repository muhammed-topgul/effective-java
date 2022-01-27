package com.muhammedtopgul.chapter002.item14;

import java.util.Comparator;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 16:09
 */

public class CompareBook implements Comparator<Book> {

    @Override
    public int compare(Book var0, Book var1) {
        return var0.getName().compareTo(var1.getName());
    }
}
