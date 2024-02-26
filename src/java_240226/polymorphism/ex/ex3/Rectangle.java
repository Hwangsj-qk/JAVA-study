package java_240226.polymorphism.ex.ex3;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("사각형의 면적: " + (height*width) );
    }
}
