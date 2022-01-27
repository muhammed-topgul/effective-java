package com.muhammedtopgul.chapter002.item14;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 15:27
 */

public class Book implements Comparable<Book> {

    private String name;
    private int pageCount;
    private long isbn;

    public Book() {
    }

    public Book(String name, int pageCount, long isbn) {
        this.name = name;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public int compareTo(Book _this) {
        // return this.name.compareTo(_this.name);
        return Integer.compare(this.pageCount, _this.pageCount);
    }
}
