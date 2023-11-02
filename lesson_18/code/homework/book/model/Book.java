package homework.book.model;

public class Book {
    private String title;
    private String author;
    private int year;
    private long isbn;

    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void displayBook(String title, String author, int year, long isbn) {
        System.out.println(title + ", " + author + "\n" + year + " year\n" + "(ISBN: " + isbn + ")");
    }
}
