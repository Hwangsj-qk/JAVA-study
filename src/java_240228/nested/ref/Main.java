package java_240228.nested.ref;

public class Main {
    public static void main(String[] args) {
        // 바깥 인스턴스 객체 생성
        OuterClass outerClass = new OuterClass();
        
        // 안족 인스턴스 객체 생성
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // 안쪽 호출 테스트
        innerClass.call();
    }
}
