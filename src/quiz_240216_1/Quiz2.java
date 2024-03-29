package quiz_240216_1;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start 숫자를 입력해주세요: ");
        int start = scanner.nextInt();;
        System.out.print("end 숫자를 입력해주세요: ");
        int end = scanner.nextInt();

        int sum = 0;

        for(int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("짝수의 합: " + sum);


    }
}
