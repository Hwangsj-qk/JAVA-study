package test1_practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // condition - ex4

        Scanner scanner = new Scanner(System. in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("두번재 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.print("연산자를 입력하세요: ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;

            case "-" :
                result = num1 - num2;
                break;

            case "*" :
                result = num1 * num2;
                break;

            case "/" :
                result = num1 / num2;
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다. ");
                    return;
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operator);       // 선생님께 여쭤보기

        }
        System.out.println("결과: " + result);



    }
}
