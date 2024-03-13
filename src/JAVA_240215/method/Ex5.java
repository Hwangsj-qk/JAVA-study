package JAVA_240215.method;

import java.util.Scanner;

public class Ex5 {
    /*
      두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
      메서드 이름 : calculate
      호출 예시
      첫 번째 정수를 입력하세요: 10
      두 번째 정수를 입력하세요: 20
      연산 기호를 입력하세요: +
      연산 결과: 30
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.print("연산 기호를 입력하세요: ");
        String operator = scanner.next();

        System.out.println("연산 결과: " + calculate(num1, num2, operator));

    }

    public static int calculate(int num1 , int num2, String operator) {
        switch (operator) {
            case "+" :
                return num1 + num2;

            case "-" :
                return num1 - num2;

            case "*" :
                return num1 * num2;

            case "/" :
                return num1 / num2;
            default: return 0;
        }

    }
}
