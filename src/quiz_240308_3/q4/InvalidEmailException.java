package quiz_240308_3.q4;

import java.util.Scanner;

public class InvalidEmailException extends Exception {

    public InvalidEmailException(String message){
        super(message);
    }

    public static void method(String email) throws InvalidEmailException {
        if(!email.contains("@")) {
            throw  new InvalidEmailException("예외 발생: 유효하지 않은 이메일 주소 입니다.");
        } else {
            System.out.println("이메일 주소가 유효합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("이메일 주소를 입력하세요: ");
            String email = scanner.nextLine();
            method(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }

}
