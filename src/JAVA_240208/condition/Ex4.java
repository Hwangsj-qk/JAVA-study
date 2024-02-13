package JAVA_240208.condition;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
        사용자 로그인 시스템
        사용자로부터 아이디와 비밀번호를 입력받아,
        미리 설정된 아이디와 비밀번화와 일치하는지 검사하는
        간단한 로그인 시스템을 구현하세요.
        모든 조건이 만족할 때만 "로그인 성공!"을 출력하고,
        아이디 혹은 비밀번호가 일치하지 않으면
        "로그인 실패: 아이디 혹은 비밀번호가 잘못되었습니다."와 같은 메시지를 출력하세요
         */
        final String validUsername = "user";
        final String vaildPassword = "pass";

        Scanner scanner = new Scanner(System.in);
        System.out.print("사용자를 입력하세요: ");
        String username = scanner. next();
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.next();

        if(username.equals(validUsername) && password.equals(vaildPassword)) {
            System.out.println("로그인 성공");
        } else
            System.out.println("로그인을 실패하였습니다. ");


    }
}
