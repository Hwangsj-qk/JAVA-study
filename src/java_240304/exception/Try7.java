package java_240304.exception;

import java_240220.access_modifier.second.C;

public class Try7 {
    static class Animal{}

    static class Dog extends Animal{}
    static class Cat extends Animal{}

    public static void main(String[] args) {

        // ClassCast
        Dog dog = new Dog();
        Cat cat = new Cat();
        ChangeDog(dog);
        ChangeDog(cat);
    }

    static void ChangeDog(Animal animal) {
        // instanceOf 연산자로 타입 체크 예외 처리 (꼭 try-catch-finally 블록을 사용하지 않아도 예외 처리가 가능)
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;     // ClassCastException 이 발생 가능
        }
    }
}
