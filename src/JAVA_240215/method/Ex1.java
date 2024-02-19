package JAVA_240215.method;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요.
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째값 입력: ");
        int x = scanner.nextInt();

        System.out.print("두번째값 입력: ");
        int y = scanner.nextInt();

        System.out.println(subtract(x, y));
    }
    public static int subtract(int x ,int y) {
        System.out.print("두 수를 뺄셈 값: ");
        return x - y;

    }
}
