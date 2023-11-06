package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album{
    //static methods
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate()); //сортировка по датам
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); //если даты совпали, то сортировка по айди
    };

    //fields
    private Photo[] photos;
    private int size;

    //constructor
    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    };

    //methods
    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        //find index of place where we will put new photo
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        //обработка индекса
        index = index >= 0 ? index : -index -  1;
        //раздвигаем массив с индекса на одно место вправо, для этого мы берем System.arraycopy
        //он копирует тот массив, который мы говорим, с какого-то места,
        //мы копируем наш массив с места index+1
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        //find photo
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                //"надвинем" массив на найденную позицию
                System.arraycopy(photos ,i + 1, photos, i, size - 1 - i);
                //size уменьшить
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId); //нашли фото, которое было передано
        if (photo == null) {
            return false;
        }
        photo.setUrl(url); //обновили url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null); //определили переданный объект, с которым будем сранивать элементы массива
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate(p -> albumId == p.getAlbumId());
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size];
        int j = 0; //счетчик найденных в альбоме фото
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                res[j++] = photos[i];
            }
        } //таким образом мы заполнили массив, но после j в нем много пустого места и нужно это обрезать
        return Arrays.copyOf(res, j); //вернули обрезанный массив без элементов null
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {

        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }


}
