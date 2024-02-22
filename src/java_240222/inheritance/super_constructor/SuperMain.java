package java_240222.inheritance.super_constructor;

public class SuperMain {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 1. SubClass -> Superclass -> GrandClass
        // 2-1. GrandClass() -> Superclass() => SubClass()
        // 2-2. GrandClass() -> Superclass(100) => SubClass()
    }
}
