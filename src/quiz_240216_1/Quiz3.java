package quiz_240216_1;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수는 몇명인가요? ");
        int studentNum = scanner.nextInt();

        int [] scores = new int[studentNum];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("점수 입력: ");
            scores[i] = scanner.nextInt();

            sum = sum+ scores[i];

        }
        System.out.println("합계: " + sum + ", 평균: " + (double)(sum/scores.length));

    }
}
