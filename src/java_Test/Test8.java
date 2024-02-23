package java_Test;

import java_240216.enum0.Enum1;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.print("팩토리얼을 구할 숫자를 입력하세요");
        int n = scanner.nextInt();

        System.out.println("Max of " + num1 + ", " + num2 + " : " + MathUtility.max(num1, num2));
        System.out.println("Min of " + num1 + ", " + num2 + " : " + MathUtility.min(num1, num2));
        System.out.println("Sum of " + num1 + ", " + num2 + " : " + MathUtility.sum(num1, num2));
        System.out.println("Factorial of " + n + ", " +  " : " + MathUtility.factorial(n));
    }
}
