package JAVA_240215.method;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째값 입력: ");
        int x = scanner.nextInt();
        System.out.print("두번째값 입력: ");
        int y = scanner.nextInt();
        System.out.print("세번째값 입력: ");
        int z = scanner.nextInt();

        System.out.println("합계: " + sum(x,y,z));
        System.out.println("평균: " + sum(x,y,z)/3);

    }

    public static int sum (int x, int y, int z){
        return x + y + z;
    }
}
