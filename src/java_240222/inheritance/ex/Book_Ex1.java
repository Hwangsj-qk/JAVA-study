package java_240222.inheritance.ex;

public class Book_Ex1 {
    protected String title;
    protected String author;
    protected int year;

    public void displayInfo(String title, String author, int year) {
        System.out.println("도서 제목: "  + title);
        System.out.println("저자: " + author );
        System.out.println("출판 연도: " + year);
    }

}
