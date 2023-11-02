package homework.book;

import homework.book.model.Book;
import homework.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book book = new Book("451 degrees fahrenheit", "Ray Bradbury", 1953, 7275998298L);
        book.displayBook("451 degrees fahrenheit", "Ray Bradbury", 1953, 7275998298L);
        System.out.println("-------------------------------------------------------------------");

        Dictionary dictionary1 = new Dictionary("Samuel Johnson’s Dictionary of the English Language", "Samuel Johnson", 1755, 237472252536L, "England", "English", "languages");
        dictionary1.displayBook("Samuel Johnson’s Dictionary of the English Language", "Samuel Johnson", 1755, 237472252536L, "England", "English", "languages");

        System.out.println("-------------------------------------------------------------------");
        Dictionary dictionary2 = new Dictionary("Dictionary of Ozhegov", "Sergey Ozhegov", 1949, 47583465978L, "Russia", "Russian", "languages");
        dictionary2.displayBook("Dictionary of Ozhegov", "Sergey Ozhegov", 1949, 47583465978L, "Russia", "Russian", "languages");
    }
}
