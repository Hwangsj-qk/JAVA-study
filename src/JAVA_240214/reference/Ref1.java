package JAVA_240214.reference;

public class Ref1 {
    public static void main(String[] args) {  // 메소드 영역 -> 스택 영역

        // int는 기본타입(앞에 소문자)
        int int1 = 10;      // 변수 선언, 초기화 -> 스택 영역: 10(4바이트 안에서 따로 생성 없이 저장)
        int int2 = 10;

        // 문자열(앞에 대문자)은 참조타입: 힙 영역 0x100: "홍길동" <- 문자열 리터럴
        String str1 = "홍길동";  // 변수 선언, 초기화 -> 스택 영역 : 0x100(문자열리터럴에 저장)
        String str2 = "홍길동";    // 변수 선언, 문자열 리터럴를 참조: 0x100을 참조 -> 앞에 한 번 선언이 되었기 때문

//        if (int1 == int2) {
//            System.out.println("int1과 int2는 값이 같음");
//        } else {
//            System.out.println("int1과 int2는 값이 다름");
//        }
//        if (str1 == str2) {
//            System.out.println("str1과 str2는 값이 같음");
//        } else {
//            System.out.println("str1과 str2는 값이 다름");
//        }

        // new 연산자: 객체를 생성하는 연산자
        // 힙 영역: 0x200 -> 홍길동이 들어감 -> 0x300 -> 홍길동이 들어감
        String str3 = new String("홍길동");     // 변수 선언, 초기화 -> 스택 영역 0x200
        String str4 = new String("홍길동");     // 스택 영역 0x300에 입력


        // ==, != 연산: 변수의 값이 같은지 아닌지를 비교
        // 참조 타입의 경우 동일한 객체를 참조하는지 아닌지를 비교 -> 0x200과 0x300을 비교하는 것임.
        // -> 0x200 == 0x300 => false
        if (str3 == str4) { //문자 연산자는 equal로 비교하는 게 더 좋음
            System.out.println("str3과 str4는 참조가 같음");
        } else {
            System.out.println("str3과 str4는 참조가 다름");    // 값이 다름으로 나옴
        }

        // 문자열 비교를 할 때는 가능하면 equals 메소드를 사용할 것!
        if (str3.equals(str4)) { //문자열 내부값을 비교할 때는 equals 사용
            System.out.println("str3과 str4는 문자열이 같음");    // 문자열이 같다고 나옴 (참조는 다르지만 문자열은 같음)
        } else {
            System.out.println("str3과 str4는 문자열이 다름");
        }

    }
}
