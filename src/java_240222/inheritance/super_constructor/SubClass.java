package java_240222.inheritance.super_constructor;

public class SubClass extends SuperClass {

    public SubClass() {
        // 상속을 받으면, 생성자의 첫줄에 super(...)를 사용해서 부모 클래스 생성자르 호출해야 한다.
        // 매개변수가 없는 생성자(기본 생성자)의 경우 super()의 생략이 가능하다.

        super(100, "abc");    // 부모 생성자 호출 => 매개변수가 있을 시 생략불가능
        System.out.println("자식 생성자");
    }
// 나중에 디버그 돌려보기


}
