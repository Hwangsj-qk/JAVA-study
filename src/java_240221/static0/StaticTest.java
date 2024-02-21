package java_240221.static0;

public class StaticTest {
    // 필드
    private int instanceVariable;       // 인스턴스 변수 (힙 영역)
    private static int classVariable;   // 클래스 변수(공유형 => 메서드 영역)

    // 생성자

    // 메서드
    // 클래스 메서드(=스태틱 메서드)
    public static void staticInnerCall() {
//        instanceVariable++;   // 스태틱 메서드에서 인스턴스 변수 접근 불가, 컴파일 에러
        classVariable++;        // 스태틱 메서드에서 클래스 변수 접근 가능

//        instanceMethod();  ==> 인스턴스 메서드는 접근 호출
          classMethod();    // 스태틱 메서드는 호출 가능
    }

    // 인스턴스 메서드
    public void  innerCall() {
        instanceVariable++;     // 인스턴스 메서드에서 인스턴스 변수 접근 가능
        classVariable++;        // 인스턴스 메서드에서 클래스 변수 접근 가능
        instanceMethod();       // 인스턴스 메서드에서 인스턴스 메서드 호출 가능
        classMethod();          // 인스턴스 메서드에서 클래스 메서드 호출 가능
    }

    private void instanceMethod() {
        System.out.println(instanceVariable);
    }

    private static void classMethod () {
        System.out.println(classVariable);
//        System.out.println(intanceVariable);      ==> 컴파일 에러
    }
}
