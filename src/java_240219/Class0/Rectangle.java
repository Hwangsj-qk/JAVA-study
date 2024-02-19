package java_240219.Class0;

public class Rectangle {
    int width;
    int height;

    void calculatePerimeter() {
        System.out.println("둘레의 길이: " + 2*(width + height));
    }

    void calculateArea() {
        System.out.println("넓이: " + width * height );
    }
    void isSquare() {
        if(width == height){
            boolean square = true;
            System.out.println("정사각형이 맞습니다. ");
        } else {
            boolean square = false;
            System.out.println("정사각형이 아닙니다. ");
        }
    }

}

