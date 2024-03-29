package quiz_240229_2.quiz1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Lord of the Rings";
        book1.author = "J.R.R. Tolkien";
        book1.year = 1954;
        book1.displayInfo();

        ReferenceBook book2 = new ReferenceBook();
        book2.title = "Math Handbook";
        book2.author = "John Doe";
        book2.year = 1999;
        book2.field = "Mathematics";
        book2.displayInfo();
    }
}
