package java_240226.polymorphism.interface0.animal2;

// 추상 클래스
public abstract class Animal {
    //추상 메서드
    public abstract void sound();

    // 일반 메서드
    public void move() {
        System.out.println("동물이 이동합니다. ");
    }
}
