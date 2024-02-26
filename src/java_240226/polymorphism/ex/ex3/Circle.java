package java_240226.polymorphism.ex.ex3;

public class Circle extends Shape {
    double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public void area() {
        System.out.println("원의 면적: " + (r*r*(3.14)));
    }
}
