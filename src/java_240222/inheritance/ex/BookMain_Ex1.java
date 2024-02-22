package java_240222.inheritance.ex;

public class BookMain_Ex1 {
    public static void main(String[] args) {
        Book_Ex1 bookEx1 = new Book_Ex1();
        bookEx1.displayInfo("The Lord of the Rings", "J.R.R.Tolkien", 1954);

        System.out.println();

        ReferenceBook_Ex1 referenceBookEx1 = new ReferenceBook_Ex1();
        referenceBookEx1.displayInfo("Math Handbook", "John Doe",
                1999, "Mathematics");


    }
}
