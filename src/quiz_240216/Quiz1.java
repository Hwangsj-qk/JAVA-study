package quiz_240216;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환전할 금액을 입력해주세요: ");
        int dollar = scanner.nextInt();

        if(dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0) {
            System.out.println("환전금액은 " + dollar + "원입니다. ");
        } else {
            System.out.println("잘못 입력하셨습니다. ");
        }
    }
}
