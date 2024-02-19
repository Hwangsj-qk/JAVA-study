package java_240219.Class0;

import java.util.Scanner;

public class Calculator {
    // 필드: 계산기와 관련된 데이터
        char op;
        int num1;
        int num2;

        void inputNumbers() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }

// 메서드: 계산기와 관련된 기능
    int add() {
        return num1 + num2;
    }
    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }
    double divide() {       // 나누기의 경우 소수점이 나올 수 있으므로 int 보단 double이 더 적합
        if(num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다. ");
        }
        return num1 / num2;
    }


        void chooseOp() {
            switch (op) {
                case '+':
                    System.out.println("Result: " + add());
                    break;
                case '-':
                    System.out.println("Result: " + subtract());
                    break;
                case '*':
                    System.out.println("Result: " + multiply());
                    break;
                case '/':
                    System.out.println("Result: " + divide());
                    break;
                default:
                    System.out.println("Error: Invalid operator");

            }
        }




}
