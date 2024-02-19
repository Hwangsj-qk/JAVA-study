package java_240219.Class1.ex;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void borrowBook(Book book) {
        this.isAvailable = isAvailable;

        if (isAvailable == false) {
            System.out.println("대여가 불가능합니다. ");
        } else  {
            System.out.println("대여가 가능합니다. ");
        }
    }
    void returnBook(Book book) {
        this.isAvailable = isAvailable;

        isAvailable = true;

        System.out.println("책이 반납되었습니다. ");
    }
    void printInfo(Book book) {
        this.title = title;
        this.author =author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;

        if (isAvailable == true) {
            System.out.println("책 제목: " + title + " 저자: " + author + " 국제표준도서번호: " + isbn + "  도서 대여 가능 여부: 대여 가능");

        } else {

            System.out.println("책 제목: " + title + " 저자: " + author + " 국제표준도서번호: " + isbn + " 도서 대여 가능 여부: 대여 불가능" );
        }
    }
}




