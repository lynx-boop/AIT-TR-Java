package library;

public interface Library {
    boolean addBook(Book book);
    Book deleteBook(long isbn);
    Book findBook(long isbn);
    int booksQuantity();
    void printBooks();
}
