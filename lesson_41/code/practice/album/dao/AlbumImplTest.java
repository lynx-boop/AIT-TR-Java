package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] photoArray;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        Photo[] photoArray = new Photo[6];
        photoArray[0] = new Photo(1, 1, "t1", "url1", now.minusDays(2));
        photoArray[1] = new Photo(1, 2, "t2", "url2", now.minusDays(3));
        photoArray[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        photoArray[3] = new Photo(2, 1, "t1", "url4", now.minusDays(7));
        photoArray[4] = new Photo(2, 2, "t2", "url5", now.minusDays(7));
        photoArray[5] = new Photo(2, 3, "t3", "url6", now.minusDays(7));

        //don't forget to put these elements to album by method ADD:
        for (int i = 0; i < photoArray.length; i++) {
            album.addPhoto(photoArray[i]);
        }
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
        //removing existing photo:
        assertTrue(album.removePhoto(3, 1)); //removed photoArray[2] successfully
        //removing not-existing photo:
        assertFalse(album.removePhoto(1,5)); //return false (photo doesn`t exist)
        //check quantity:
        assertEquals(5, album.size());
        //can't find deleted photo:
        assertNull(album.getPhotoFromAlbum(3,1));
    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1,1, "newUrl")); //update url
        assertEquals("newUrl", album.getPhotoFromAlbum(1,1).getUrl()); //check updated url
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(photoArray[0], album.getPhotoFromAlbum(1,1)); //check photo finding
        assertNull(album.getPhotoFromAlbum(5,6));
    }

    @Test
    void getAllPhotoFromAlbum() {
        //we need to create actual array and expected
        Photo[] expected = {photoArray[3], photoArray[4], photoArray[5]}; //these photos from album 2
        Photo[] actual = album.getAllPhotoFromAlbum(2); //we chose album num 2
        Arrays.sort(actual); //sorting array for better results
        assertArrayEquals(expected, actual);
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate(); //we cut time and now there is only date
        Photo[] actual = album.getPhotoBetweenDate(ld.minusDays(1), ld.minusDays(6));
        Arrays.sort(actual);
        Photo[] expected = {photoArray[0], photoArray[1], photoArray[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}