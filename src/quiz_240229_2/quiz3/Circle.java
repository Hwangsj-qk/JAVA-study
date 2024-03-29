package quiz_240229_2.quiz3;

public class Circle extends Shape{
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("원의 면적: " + (r*r*3.14));
    }
}
