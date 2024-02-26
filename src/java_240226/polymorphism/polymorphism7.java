package java_240226.polymorphism;

public class polymorphism7 {
    public static void main(String[] args) {
        // 1. 부모 타입 변수에서 부모 타입 객체 생성 시
        SuperClass superClass = new SuperClass();
        superClass.method();    // 부모 클래스의 메서드 호출

        // 2. 자식 타입 변수에서 자식 타입 객체 생성 시
        SubClass subClass = new SubClass();
        subClass.method();      // 자식 클래스에서 오버라이딩 된 메서드 호출

        // 3. 부모 타입 변수에서 자식 타입 객체 참조 시 (다형적 참조)
        SuperClass polymorph = new SubClass();
        polymorph.method();
        // 자식 클래스에서 오버라이딩 된 메서드 호출 (부모타입 변수임에도 불구하고)
        // 오버라이딩된 메서드는 항상 우선권을 가진다 (매우 중요)

    }
}
