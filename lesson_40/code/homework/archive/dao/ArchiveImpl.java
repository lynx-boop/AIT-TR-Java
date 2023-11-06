package homework.archive.dao;

import homework.archive.model.Document;
import library.Book;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {
    //static
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate()); //сортировка по датам
        if (res == 0) {
            return Integer.compare(d1.getIdDocument(), d2.getIdDocument());
        }
        return res; //если даты совпали, то сортировка по айди
    };
    //fields
    private Document[] documents;
    private int size;
    private int capacity;
    //constructor
    public ArchiveImpl(int capacity) {
        documents = new Document[capacity];
    }
    //methods
    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocument(document.getIdFolder(), document.getIdDocument()) != null) {
            return false;
        }
        documents[size++] = document;
        return true;
    }

    @Override
    public boolean updateDocument(int documentId, int folderId, String url) {
        Document document = getDocument(folderId,documentId); //находим документ, который бел передан
        if (document == null) {
            return false;
        }
        document.setUrl(url); //обновили url
        return true;
    }

    @Override
    public Document getDocument(int idFolder, int idDocument) {
        Document pattern = new Document(idFolder, idDocument, null, null, null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(documents[i])) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocuments(int idFolder) {
        //TODO спросить, почему мы вызываем данны метод у предиката, как это работает под капотом?
        return findByPredicate(predicate -> idFolder == predicate.getIdFolder());
    }

    //TODO объясните еще раз, как работает этот код?
    private Document[] findByPredicate (Predicate<Document> predicate) {
        Document[] docArray = new Document[size];
        int j = 0; //счетчик найденных документов
        for (int i = 0; i < size; i++) {
            //заполняем массив элементами, которые удовлетворят условию поиска в предикате
            if (predicate.test(documents[i])) {
                docArray[j++] = documents[i];
            }
        }
        //создаем новый массив на основе docArray и заполнили его элементами до j-того индекса, т.к. после него идут только null
        return  Arrays.copyOf(docArray, j);
    }

    @Override
    public Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Document[] docArray = new Document[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (dateFrom.isAfter(documents[i].getDate()) && dateTo.isBefore(documents[i].getDate())) {
                docArray[j] = documents[i];
            }
        }
        return docArray;
    }


    @Override
    public int size() {
        return size;
    }
}
