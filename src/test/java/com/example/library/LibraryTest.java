package test.java.com.example.library;

import main.java.com.example.library.Book;
import main.java.com.example.library.BookNotAvailableException;
import main.java.com.example.library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        Book book = new Book("1234567890", "Title", "Author", 2023);
        library.addBook(book);
        assertTrue(library.viewAvailableBooks().contains(book));
    }

    @Test
    void testBorrowBook() {
        Book book = new Book("1234567890", "Title", "Author", 2023);
        library.addBook(book);
        assertTrue(library.borrowBook("1234567890"));
    }

    @Test
    void testBorrowBookUnavailable() {
        assertThrows(BookNotAvailableException.class, () -> library.borrowBook("1234567890"));
    }

    @Test
    void testReturnBook() {
        Book book = new Book("1234567890", "Title", "Author", 2023);
        library.addBook(book);
        library.borrowBook("1234567890");
        library.returnBook("1234567890");
        assertTrue(library.viewAvailableBooks().contains(book));
    }

    @Test
    void testViewAvailableBooks() {
        Book book1 = new Book("1234567890", "Title1", "Author1", 2023);
        Book book2 = new Book("0987654321", "Title2", "Author2", 2024);
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.viewAvailableBooks().contains(book1));
        assertTrue(library.viewAvailableBooks().contains(book2));
    }
}
