package JAVA_240207.variable;

import com.sun.security.jgss.GSSUtil;

public class Escape {
    public static void main(String[] args) {
        // 이스케이프 문자
        // 문자열 내부에 역슬래시가 붙은 문자
        // 문자열 내부에 특정 문자 포함 가능

//        String str = "나는 "자바"를 좋아합니다. "; -> 컴파일 에러 발생
        String str = "나는 \"자바\"를 좋아합니다."; // 많이 사용됨
        // 탭문자 \t(프로그램에 따라서 탭 간격은 달라질 수 있음)
        System.out.println("번호\t이름\t직업");
        // 줄바꿈 \n
        System.out.println("문자열 내부에서 \n 줄을 바꿉니다. ");
        // 역슬래시\\
        System.out.println("역슬래시\\"); // 경로를 지정할 때 많이 사용됨.
    }
}
