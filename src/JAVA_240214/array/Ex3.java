package JAVA_240214.array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 점수를 입력받을 학생수를 입력받고
        // 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력해주세요: ");
        int stu = scanner.nextInt();
        int [] scores = new int[stu];
        int sum = 0;
        int mean = 0;


        for(int i = 0; i < stu; i++) {
            System.out.print("점수를 입력: ");
            scores[i] = scanner.nextInt();
            sum = sum + scores[i];

        }
        System.out.println("sum = " + sum);
        System.out.println("mean = " + (double) sum/scores.length);

    }
}
