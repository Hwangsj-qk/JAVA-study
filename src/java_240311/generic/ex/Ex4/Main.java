package java_240311.generic.ex.Ex4;

public class Main {
    public static void main(String[] args) {
        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        bookLibrary.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        MediaLibrary<Movie> movieLibrary = new MediaLibrary<>();
        movieLibrary.addMedia(new Movie("Inception", "Christopher Nolan"));

        System.out.println("Books:");
        bookLibrary.printMediaTitles();

        System.out.println("Movies:");
        movieLibrary.printMediaTitles();
    }
}
