package homework.library;

public class LibraryImpl implements Library{
    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if(book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }

        books[size] = book;
        size++;

        return true;
    }

    @Override
    public Book deleteBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn) {
                Book deletedBook = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return deletedBook;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int booksQuantity() {
        return size;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
