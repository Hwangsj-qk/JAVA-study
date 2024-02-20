package java_240220.com.library.management;

import java.util.Scanner;

public class Library {
    // 필드
    Book [] books;  // book의 객체 배열
    int index = 0;

    // 생성자
    Library(int capacity) {     // 매개변수를 하나 받음
        this.books = new Book[capacity];    // 길이만큼 배열 초기화
        // -> 배열 초기화는 new 사용

    }

    // 메서드
    public void addBook(Book book) {
        books[index] = book;
        index++;    // books[1] = book;
        }


    public void listBooks() {
        for (int i = 0; i < index; i++) {
            System.out.println(i + 1 + ". 제목: " );

        }

    }

}

