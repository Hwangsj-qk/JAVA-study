package JAVA_240208.Operator;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 사용자로부터 두 점수를 입력받아, 두 점수 중 큰 값을 출력하는  프로그램을 작성하세요.
        // 이때, 조건 연산자(삼항 연산자)를 이용하여 구현하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int first = scanner.nextInt();
        System.out.print("b= ");
        int second = scanner.nextInt();

        int greater = (first > second) ? first : second ;
        System.out.println("큰 수: " + greater);

    }
}
