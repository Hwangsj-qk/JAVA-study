package JAVA_240207.variable;

public class Print1 {
    public static void main(String[] args) {
        System.out.println("안녕하세요");    // print: 출력 + ln: line 변경
        System.out.println("안녕하세요");    // print: 출력 + ln: line 변경
        System.out.println("안녕하세요");    // print: 출력 + ln: line 변경
        // ctrl + D: 앞 행 복사 + 붙여넣기
        // -> println: 시스템 출력장치로 매개변수를 출력하고 행(ln)을 변경해라

        System.out.print("안녕하세요");  // 행을 변경하지 않고 출력
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");

        System.out.printf("이름: %s", "홍길동"); // 형식문자열을 출력

        /*
            자주 사용되는 형식 문자열
            - %s: 문자열 -> %10s : 열자리 문자열 형식 (띄어쓰기라고 생각하면 됨)
            - %d: 정수 -> %10d: 열자리 정수
            - %f: 실수 -> %10f: 열자리 실수 %10.2:소수점 둘째자리까지
         */
        System.out.printf("%10s", "\n홍길동"); // 형식 잘 맞춰서 적지 않으면 컴파일 에러 발생
        System.out.printf("%10d", 100);
        System.out.printf("%10.2f", 10.0);  // 기본 소수점 값 6자리


    }
}
