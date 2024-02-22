package java_240222.inheritance;

public class Child extends Parent {
    // 'is-a' 관계를 가지고 오진 못해서 좋은 예시는 아님(이해하기 위함)
    String field = "child";

    @Override
    public void callMethod() {
        System.out.println("자식 클래스의 메서드");
    }

    public void test() {
        // this: 자기 자신을 참조한다. (생략 가능)
        // super: 부모 클래스를 참조한다.
        System.out.println("this.field = " + this.field);       // child 자기 자신 필드
        System.out.println("super.field = " + super.field);     // parent 필드

        this.callMethod();  // 자식 클래스
        super.callMethod(); // 부모 클래스
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test();
    }
}
