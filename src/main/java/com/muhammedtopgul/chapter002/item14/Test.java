package com.muhammedtopgul.chapter002.item14;

import java.util.*;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 15:29
 */

public class Test {

    private static Random random = new Random();

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book;
        int pageCount, name;
        long isbn;
        for (int i = 0; i < 10; i++) {
            pageCount = random.ints(100, 300).findFirst().getAsInt();
            name = random.ints(97, 122).findFirst().getAsInt();
            isbn = random.ints(10_000_000, 15_000_000).findFirst().getAsInt();

            book = new Book();
            book.setName("Book - " + (char) name);
            book.setPageCount(pageCount);
            book.setIsbn(isbn);
            books.add(book);
        }


        printBooks(books, "Before Sort: ");

        System.out.println("::::::::::::With Comparable::::::::::::");
        Collections.sort(books);
        printBooks(books, "After Sort: ");


        System.out.println("::::::::::::With Comparator::::::::::::");

        Comparator<Book> compareByName = (var0, var1) -> var0.getName().compareTo(var1.getName());
        books.sort(compareByName);
        printBooks(books, "Sort By Name: ");


        Comparator<Book> compareByIsbn = (var0, var1) -> Long.compare(var0.getIsbn(), var1.getIsbn());
        // books.sort(compareByIsbn);
        Collections.sort(books, compareByIsbn);
        printBooks(books, "Sort By Isbn: ");

        CompareBook compareBook = new CompareBook();
        books.sort(compareBook);
        printBooks(books, "By Name via Class: ");
    }

    public static void printBooks(List<Book> books, String title) {
        System.out.println(title);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}
