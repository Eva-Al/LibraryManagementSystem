package com.library.models;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int yr) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = yr;
    }

    public String toString() {
        return "📘 " + title + " by " + author + " (ISBN: " + isbn + ") in "+ year  ;
    }
}
