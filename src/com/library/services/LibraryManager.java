package com.library.services;

import com.library.models.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private List<Book> books = new ArrayList<>();
    public LibraryManager() {
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960));
        books.add(new Book("1984", "George Orwell", "9780451524935", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "9781503290563", 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
        books.add(new Book("Moby Dick", "Herman Melville", "9781503280786", 1851));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227", 1937));
        books.add(new Book("War and Peace", "Leo Tolstoy", "9781400079988", 1869));
        books.add(new Book("Jane Eyre", "Charlotte Brontë", "9780141441146", 1847));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951));
        books.add(new Book("The Alchemist", "Paulo Coelho", "9780061122415", 1988));}

    public void addBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine().trim();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        books.add(new Book(title, author, isbn, year));
        System.out.println("✅ Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("🚫 No books available.");
        } else {
            System.out.println("📚 Book List:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
