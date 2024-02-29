package quiz_240229.quiz3;

public class Triangle extends Shape{
    int a;
    int b;

    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println("삼각형의 면적: " + ((a*b)/2));
    }
}
