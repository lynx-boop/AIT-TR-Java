package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] photoArray;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        Photo[] photoArray = new Photo[6];
        photoArray[0] = new Photo(1, 1, "t1", "url1", now.minusDays(7));
        photoArray[1] = new Photo(1, 2, "t2", "url2", now.minusDays(7));
        photoArray[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        photoArray[3] = new Photo(2, 1, "t1", "url4", now.minusDays(7));
        photoArray[4] = new Photo(2, 2, "t2", "url5", now.minusDays(7));
        photoArray[5] = new Photo(2, 3, "t3", "url6", now.minusDays(7));
        // TODO don't forget to put these elements to album by method ADD
    }

    @Test
    void addPhoto() {
        // cant' add null
        assertFalse(album.addPhoto(null));
        // can't exceed capacity
        assertFalse(album.addPhoto(photoArray[0]));
        // check opportunity of addition
        Photo photo = new Photo(3, 1, "t", "url", now);
        assertTrue(album.addPhoto(photo));
        // check expected capacity after addition (check size)
        assertEquals(7, album.size());
        // can't add already existed
        photo = new Photo(3, 1, "t", "url", now);
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void removePhoto() {
    }

    @Test
    void updatePhoto() {
    }

    @Test
    void getPhotoFromAlbum() {
    }

    @Test
    void getAllPhotoFromAlbum() {
    }

    @Test
    void getPhotoBetweenDate() {
    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}