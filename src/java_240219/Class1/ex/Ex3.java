package java_240219.Class1.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Book book = new Book("죄와벌", "도스토예프스키", "12355", false);
        Book book1 = new Book("인간실격", "다자이 오사무", "123596", true);
        Book book2 = new Book("해리포터", "조앤 K. 롤링", "3448556", true);
        Book book3 = new Book("로미오와 줄리엣", "윌리엄 셰익스피어", "546284957", false);

        book.borrowBook(book);
        book.returnBook(book);

        Scanner scanner = new Scanner(System.in);
        System.out.print("책 이름 또는 저자를 입력하세요:");
        String search = scanner.nextLine();

        if (search.equals(book.title) || search.equals(book.author)) {
            book.printInfo(book);
        } else if (search.equals(book1.title) || search.equals(book1.author)) {
            book.printInfo(book1);
        } else if (search.equals(book2.title) || search.equals(book2.author)) {
            book.printInfo(book2);
        } else if (search.equals(book3.title) || search.equals(book3.author)) {
            book.printInfo(book3);
        } else {
            System.out.println("잘못 입력하셨습니다. ");
        }




    }
}
