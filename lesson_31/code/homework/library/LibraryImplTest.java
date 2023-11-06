package homework.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        Book[] books = new Book[4];
        books[0] = new Book(100, "Autor0", "Name0", 2000);
        books[1] = new Book(101, "Autor1", "Name1", 2005);
        books[2] = new Book(102, "Autor2", "Name2", 2010);
        books[3] = new Book(103, "Autor3", "Name3", 2015);

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
    }

    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить уже существующую книгу
        assertFalse(library.addBook(books[1]));
        // cоздадим новую книгу
        Book book1 = new Book(104, "Author4", "Name4", 2020);
        assertTrue(library.addBook(book1)); // проверили, что новая книга добавлена
        assertEquals(5, library.booksQuantity()); // проверили длину массива с книгами
        Book book2 = new Book(105, "Author5", "Name5", 2021);
        assertFalse(library.addBook(book2)); // добавить еще не можем, т.к. будет уже переполнение
    }

    @Test
    void deleteBook() {
        // удаляем книгу
        assertEquals(books[1], library.deleteBook(101));
        // проверяем, присутствует ли эта книга после удаления
        assertEquals(2, library.booksQuantity());
        // проверяем на удаление дважды
        assertNull(library.deleteBook(101));
    }

    @Test
    void findBook() {
        // проверяем правильно ли работает поиск по isbn
        System.out.println(Arrays.toString(books));
        assertEquals(books[2], library.findBook(102));
        // ищем несуществующую книгу
        assertNull(library.findBook(107));
    }

    @Test
    void booksQuantity() {
        library.booksQuantity();
    }

    @Test
    void printBooks() {
        library.printBooks();
    }
}