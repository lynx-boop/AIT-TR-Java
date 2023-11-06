package homework.archive.dao;

import homework.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    Archive archive;
    LocalDate now = LocalDate.now();
    Document[] documents;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(5);
        documents = new Document[4];
        documents[0] = new Document(1, 1, "t1", "url1", now.minusDays(2));
        documents[1] = new Document(1, 2, "t2", "url2", now.minusDays(3));
        documents[2] = new Document(2, 1, "t1", "url1", now.minusDays(5));
        documents[3] = new Document(2, 2, "t2", "url2", now.minusDays(7));

        for (int i = 0; i < documents.length; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocument() {
        assertFalse(archive.addDocument(null)); //не можем добавить null
        assertFalse(archive.addDocument(documents[0])); //не можем добавить существующее
        Document newDocument = new Document(2, 3, "t3", "url3", now.minusDays(3));
        assertTrue(archive.addDocument(newDocument)); //можем добавить новый элемент
        assertEquals(5, archive.size()); //проверяем ожидаемое кол-во объектов в массиве после добавления
        Document newDocument2 = new Document(1, 3, "t3", "url3", now.minusDays(3));
        assertFalse(archive.addDocument(newDocument2));// не может превысить размер массива archive
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1, 1, "newUrl1"));
        assertEquals("newUrl1", archive.getDocument(1,1).getUrl());
    }

    @Test
    void getDocument() {
        assertEquals(documents[0], archive.getDocument(1,1));
        assertNull(archive.getDocument(5,6)); //не находит несуществующее фото
    }

    @Test
    void getAllDocuments() {
        //создаем актуальный массив и ожидаемый
        Document[] expected = {documents[0], documents[1]}; //все фото из 1-го альбома
        Document[] actual = archive.getAllDocuments(1); //выбран альбом 1
        Arrays.sort(actual); //sorting array for better results
        assertArrayEquals(expected, actual);
    }

    @Test
    void getDocumentBetweenDate() {
        Document[] actual = archive.getDocumentBetweenDate(now.minusDays(1), now.minusDays(6));
        Arrays.sort(actual);
        Document[] expected = {documents[0], documents[1], documents[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
    }
}