package homework.book.model;

public class Dictionary extends Book {
    private String country;
    private String language;
    private String area;

    public Dictionary(String title, String author, int year, long isbn, String country, String language, String area) {
        super(title, author, year, isbn);
        this.country = country;
        this.language = language;
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public String getArea() {
        return area;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void displayBook(String title, String author, int year, long isbn, String country, String language, String area) {
        super.displayBook(title, author, year, isbn);
        this.area = area;
        this.language = language;
        this.country = country;
        System.out.println("country: " + country + ", language: " + language + ", area: " + area);
    }
}
