package practice.album.model;

import java.time.LocalDateTime;

public class Photo implements Comparable<Photo>{
    //fields
    private int albumId;
    private int photoId;
    String title;
    String url;
    LocalDateTime date;
    //constructor

    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    //getters and setters
    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //methods
    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (albumId != photo.albumId) return false;
        return photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        int result = albumId;
        result = 31 * result + photoId;
        return result;
    }

    @Override
    public int compareTo(Photo o) {
        //надо определить как сортировать объекты в массиве Photo по двум полям - photoId и albumId
        int res = Integer.compare(this.albumId, o.albumId);
        return res != 0 ? res : Integer.compare(this.photoId, o.photoId); //тернарный оператор
    }
}
