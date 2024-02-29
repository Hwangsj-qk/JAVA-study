package quiz_240229.quiz1;

public class ReferenceBook extends Book {
    String field;

    @Override
    void displayInfo() {
        System.out.println("title: " + title + ", author: " + author + ", year: " + year + ", field: " + field);
    }
}
