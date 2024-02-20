package java_240208.Operator;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 논리 연산자
        // 사용자로부터 두 개의 불리언 값을 입력받습니다.
        // 이 두 값에 대해 and, or, not 연산을 수행하고
        // 각 결과를 출력하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.println("b1: ");
        boolean b1 = scanner.nextBoolean();
        System.out.println("b2: ");
        boolean b2 = scanner.nextBoolean();
        System.out.println("b1 and b2: " + (b1 && b2));
        System.out.println("b1 or b2: " + (b1 || b2));
        System.out.println("not b1: " + (! b1));
        System.out.println("not b2: " + (! b2));
    }
}
