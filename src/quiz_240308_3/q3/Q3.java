package quiz_240308_3.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                try {
                    System.out.print("첫번째 숫자 입력: ");
                    int num1 = scanner.nextInt();
                    System.out.print("두번째 숫자 입력: ");
                    int num2 = scanner.nextInt();
                    double result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                } catch ( ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } catch (InputMismatchException e) {
                    System.out.println("유효한 숫자를 입력하세요.");
                }







    }



}
