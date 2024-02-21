package java_240221.static0;

public class Static1 {
    // 메서드 영역에 관련 클래스 정보와 메서드 정보가 메모리에 올라간다.
    // 자바 프로그램이 실행되면서 Entry Point(진입점: main 함수)을 찾는다.
    // 스택에 메인 메서드 스택 프래임이 생성된다.
    public static void main(String[] args) {
        System.out.println("메인 메서드 시작");
        staticMethod();     // 스태틱 메서드1 호출 -> 스택 프레임 생성
        System.out.println("메인 메서드 끝");
        // static은 메서드 영역과 관련 => 앞에 스태틱을 붙이는 순간 힙 영역(공유X)에서 메소드 영역(공유O)으로 이동
    }

    static void staticMethod() {
        System.out.println("메서드1 시작");
        // 새로운 클래스의 정보를 메서드 영역에 저장한다.
        Data data = new Data(100);     // 힙 영역에 객체 생성, 메인 메서드 끝날 때 스택 영역(Data data)은 사라짐
        // 메서드 영역의 생성자 정보(생성자 정보는 메서드 영역에 저장)에 접근하여 생성자 함수 실행
        // 스택 영역의 data 변수에 생성된 메모리 주소를 바인딩
        staticMethod2(data);// 스택 영역에 메소드 호출 + 스택 프레임 생성
        // 메서드 2 스택 프레임의 매개변수 data의 참조값을 dataParam에 복사하여 전달
        System.out.println("메서드1 끝");
        // 메서드1 스택 프레임이 제거된다. data 변수도 프레임과 함께 제거
        // 더이상 data(100) 객체를 참조하는 변수가 하나도 남아있지 않게 됨
        // GC가 객체도 제거하게 된다.
    }
    static void staticMethod2(Data dataParam) {
        System.out.println("메서드2 시작");
        System.out.println("데이터 객체의 필드: " + dataParam.getField());
        // 힙영역의 dataParam의 참조값에 접근한다.
        // 메서드 영역(공유)의 Data 클래스의 getField 메서드 코드에 접근한다.
        System.out.println("메서드2 끝");
        // 메서드2 스택 프레임이 제거된다. dataParam 변수도 프레임과 함께 제거
    }


}
