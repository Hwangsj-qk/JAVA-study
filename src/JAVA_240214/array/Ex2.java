package JAVA_240214.array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 5개 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        /* 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
         */
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];

        System.out.println("정수를 5개 입력하세요. ");
        scores[0] = scanner.nextInt();
        scores[1] = scanner.nextInt();
        scores[2] = scanner.nextInt();
        scores[3] = scanner.nextInt();
        scores[4] = scanner.nextInt();

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }


    }
}
