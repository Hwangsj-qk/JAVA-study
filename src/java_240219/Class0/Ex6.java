package java_240219.Class0;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 객체지향 코드로 변경
        Calculator calculator = new Calculator();

        calculator.inputNumbers();      // 값 입력받기

        System.out.print("Enter operator (+, -, *, /): ");
        Scanner scanner = new Scanner(System.in);
        calculator.op = scanner.next().charAt(0);

        calculator.chooseOp();
        // 모듈화도 너무 과하게 하지 말 것.

    }
}
