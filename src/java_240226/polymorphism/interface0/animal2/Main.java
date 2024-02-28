package java_240226.polymorphism.interface0.animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Animal 클래스를 상속받은 클래스만 가능
        sound(cat);
        sound(sparrow);
        sound(penguin);

        // flyable 인터페이스를 상속받은 클래스만 가능
        fly(sparrow);
        fly(penguin);
        // cat은 flyable을 상속받지 않았으므로 불가능
    }

    static void sound(Animal animal) {
        animal.sound();
    }
    static void fly(Flyable flyable) {
        flyable.fly();
    }
}
