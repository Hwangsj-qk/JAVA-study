package java_240311.generic.ex.ex5;

public class MediaLibrary<T extends Media> {        // 제네릭 정의 -> T를 통해 다양한 타입을 넣을 수 있음.
    // interface 를 받은 객체만 가능하도록 제한
    Media[] mediaArray = new Media[10];        // 배열 정의
    int index = 0;      // 인덱스 번호 추적



    public void addMedia(T media) {     // addMedia 에는 다양한 타입이 들어와야 함. (Book, Music, Movie)
        mediaArray[index++] = media;        // 입력 받은 미디어를 인덱스에 넣기 (각 인덱스의 번호를 가짐)

    }
    void printMediaTitles() {

        for (int i = 0; i < index; i++) {
            System.out.println(mediaArray[i].getTitle());
        }
    }
}





class Book implements Media {
    String title;
    String author;
    public Book( String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Author: " + author;
    }
}


class Music  implements Media {
    private String title;
    String artist;
    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Artist: " + artist;
    }
}

class Movie implements Media {
    String title;
    String director;
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Director: " + director;
    }
}
