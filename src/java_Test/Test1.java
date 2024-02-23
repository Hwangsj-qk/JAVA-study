package java_Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요: ");
        int n = scanner.nextInt();

        int multiply;
        for (int i = 1; i <= 9; i++) {
            System.out.println( n + " * " + i + " = " + (i*n));
        }
    }
}
