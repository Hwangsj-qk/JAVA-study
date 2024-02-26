package java_240226.polymorphism;


public class AnimalMain2 {
    public static void main(String[] args) {
        // 해결해야할 문제
        // 1. 동물이라는 추상적 개념 을 직접 생성해서 사용할 수 있는 문제가 발생
        Animal a = new Animal();

        // 2. 상속받은 메서드에서 해당 메서드를 오버라이딩하지 않은 문제 발생 (메서드 이름이 다른 경우)
        Animal [] animals = { new Dog(), new Cat(), new Pig(),a, new Chicken()};

        for (Animal animal : animals) {
            animal.sound();

        }
    }
}
