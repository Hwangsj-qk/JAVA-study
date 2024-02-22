package java_240222.inheritance.ex;

public class ReferenceBook_Ex1 extends Book_Ex1{
    String field;


    public void displayInfo(String title, String author, int year, String field) {
        this.field = field;
        super.displayInfo(title, author, year);
        System.out.println("참고서 분야: " + field);
    }

}
