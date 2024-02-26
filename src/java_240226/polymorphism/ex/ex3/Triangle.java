package java_240226.polymorphism.ex.ex3;

public class Triangle extends Shape{
    int height;
    int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("삼각형의 면적: " + ((height*width)/2));
    }
}
