package java_240305.library.lang;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {
        // System 클래스는 객체를 생성하지 않는다.
        // 모든 멤버를 static으로 클래스 이름을 통해 접근하여 사용한다.
//        System system = new System();     오류(객체를 생성하지 않는다)
        System.out.println();       // 표준 출력 PrintStream 을 사용

        // 필드
        InputStream in = System.in;
        // 표준 입력 스트림: 주로 키보드 입력을 받을 때 사용 (스캐너와 함께 사용)
        PrintStream  out = System.out;
        // 표준 출력 스트립: 콘솔에 출력할 때 사용 (sout과 자주 사용)
        PrintStream err = System.err;
        // 표준 오류 스트림: 에러 메시지 출력할 때 사용

        System.err.println("에러가 발생했습니다.");
        // 에러 메시지나 경고 메시지 표시에 사용
        System.out.println("시스템 클래스 사용합니다.");
        System.err.println("오류 메시지는 마지막에 출력되니 주의하세요!");

        // 메서드
        // 환경 변수 조회 -> 디버거로 확인
        Map<String, String> getenv = System.getenv();
        String path = System.getenv("PATH");

        System.out.println("\n 환경변수 : \n" + path);

        // 시스템 속성 조회
        Properties properties = System.getProperties();
        String property = System.getProperty("os.name");
        System.out.println("\n운영체제 이름: " + property);

        // 프로그램 종료
//        System.exit(0);     // 정상종료 상태 코드: 0
//        System.exit(1);     // 비정상종료 상태 코드: 1 (정상 종료 제외)
    }
}
