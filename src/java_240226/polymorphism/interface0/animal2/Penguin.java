package java_240226.polymorphism.interface0.animal2;

import com.sun.security.jgss.GSSUtil;

public class Penguin extends Animal implements Swimable, Flyable{
    @Override
    public void sound() {
        System.out.println("펭펭");
    }

    @Override
    public void swim() {
        System.out.println("펭귄이 수영합니다. ");
    }

    @Override
    public void fly() {
        System.out.println("펭군이 파다닥 날개짓을 합니다. ");
    }
}
