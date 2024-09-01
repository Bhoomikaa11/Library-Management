package main.java.com.example.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new library instance
        Library library = new Library();

        // Create some book instances
        Book book1 = new Book("1234567890", "Java Programming", "John Doe", 2023);
        Book book2 = new Book("0987654321", "Effective Java", "Joshua Bloch", 2018);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // View available books
        System.out.println("Available books:");
        List<Book> availableBooks = library.viewAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Borrow a book
        System.out.println("\nBorrowing 'Java Programming':");
        if (library.borrowBook("1234567890")) {
            System.out.println("Successfully borrowed 'Java Programming'.");
        } else {
            System.out.println("Failed to borrow 'Java Programming'.");
        }

        // View available books after borrowing
        System.out.println("\nAvailable books after borrowing:");
        availableBooks = library.viewAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Return the book
        System.out.println("\nReturning 'Java Programming':");
        library.returnBook("1234567890");

        // View available books after returning
        System.out.println("\nAvailable books after returning:");
        availableBooks = library.viewAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
