package JAVA_240207.variable;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
            /* Scanner를 이용해서 변수에 입력을 받고 출력하는 코드를 작성해주세요
        1. 이름: ________ (enter)
        2. 주민번호앞자리: _______ (enter)
        3. 전화번호: ______ (enter)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름: ");
        String name = scanner.nextLine();

        System.out.print("2. 주민번호앞자리: ");
        int number = scanner.nextInt();

        System.out.print("3. 전화번호: ");
        String tel = scanner.nextLine();

    }
}
