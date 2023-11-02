package homework.archive.model;

import java.time.LocalDate;
import java.util.Comparator;

public class Document implements Comparable<Document> {
    //fields
    private int idFolder;
    private int idDocument;
    private String title;
    private String url;
    private LocalDate date;

    //constructor
    public Document(int idFolder, int idDocument, String title, String url, LocalDate date) {
        this.idFolder = idFolder;
        this.idDocument = idDocument;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    //getters and setters

    public int getIdFolder() {
        return idFolder;
    }

    public void setIdFolder(int idFolder) {
        this.idFolder = idFolder;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //methods
    @Override
    public String toString() {
        return "Document{" +
                "idFolder=" + idFolder +
                ", idDocument=" + idDocument +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Document d) {
        int res = Integer.compare(this.idFolder, d.idFolder);
        return res != 0 ? res : Integer.compare(this.idDocument, d.idDocument);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (idFolder != document.idFolder) return false;
        return idDocument == document.idDocument;
    }

    @Override
    public int hashCode() {
        int result = idFolder;
        result = 31 * result + idDocument;
        return result;
    }

}
