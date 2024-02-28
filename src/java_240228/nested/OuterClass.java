package java_240228.nested;

public class OuterClass {
    // 1. 정적 중첩 클래스
    static class NestedStaticClass{
        // 정적 중첩 클래스 내부 메서드
        public void printMessage() {
            System.out.println("정적 중첩 클래스의 메시지입니다. ");

        }
    }

    // 2. 내부 클래스(Inner Class) 외부 클래스의 인스턴스에 종속적인 클래스
    class InstanceInnerClass{
        public void printMessage() {
            System.out.println("내부 클래스의 메시지입니다.");
        }
    }
    // 3. 지역(local) 클래스
    // 메서드 내부에서 정의
    public  void displayMessage() {
        class LocalClass {
            void printMessage() {
                System.out.println("지역 클래스의 메시지입니다. ");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printMessage();
    }
}
