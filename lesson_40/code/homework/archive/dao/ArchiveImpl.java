package homework.archive.dao;

import homework.archive.model.Document;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Comparator;

public class ArchiveImpl implements Archive {
    //static
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate()); //сортировка по датам
        return res != 0 ? res : Integer.compare(d1.getIdDocument(), d2.getIdDocument()); //если даты совпали, то сортировка по айди
    };
    //fields
    private Document[] documents;
    private int size;
    //constructor
    public ArchiveImpl(Document[] documents, int size) {
        this.documents = documents;
        this.size = size;
    }
    //methods
    @Override
    public boolean addDocument(Document document) {
        return false;
    }

    @Override
    public boolean updateDocument(Document document) {
        return false;
    }

    @Override
    public Document getDocument(int idFolder, int idDocument) {
        return null;
    }

    @Override
    public Document[] getAllDocuments(int idFolder) {
        return new Document[0];
    }

    @Override
    public Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
