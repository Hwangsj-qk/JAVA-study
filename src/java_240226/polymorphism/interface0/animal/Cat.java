package java_240226.polymorphism.interface0.animal;

// 인터페이스는 상속받을 때 extends(확장) 가 아닌 implement(구현)라는 키워드 사용
public class Cat implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다. ");
    }

    @Override
    public void charming() {
        System.out.println("고양이가 꾹꾹이를 눌러줍니다. ");
    }
}
