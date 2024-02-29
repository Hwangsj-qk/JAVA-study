package quiz_240229.quiz3;

public class Rectangle extends Shape{

    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

    }
    @Override
    public void area() {
        System.out.println("사각형의 면적: " + (a*b));
    }
}
