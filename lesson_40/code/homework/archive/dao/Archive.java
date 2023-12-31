package homework.archive.dao;

import homework.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean updateDocument(int idFolder, int idDocument, String url);
    Document getDocument(int idFolder, int idDocument);
    Document[] getAllDocuments(int idFolder);
    Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
