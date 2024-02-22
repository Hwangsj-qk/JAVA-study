package JAVA_240214.array;

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        // +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
        // +) 학생의 수를 입력받아서 n명 만큼의 총점과 평균을 구하기

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int studentNunber = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][]scores = new int[studentNunber][subjects.length]; // 어쨌든 숫자로 들어와야 함
        // 행: 학생수, 열: 과목점수

        // 점수입력
        for (int[] students : scores) {     // 학생 수 받는 반복문
            System.out.println("학생의 성적을 입력하세요");
            for (int i = 0; i < subjects.length; i++) {     // 점수를 받는 반복문
                System.out.println(subjects[i] + " 점수: ");
                students[i] = scanner.nextInt();
            }
        }

        // 총점과 평균 구하기
        for (int i = 0; i < scores.length; i++) {  // 학생 수만큼 반복
            int sum = 0;        // sum도 각 학생들에게 다 필요
            for (int j = 0; j < scores[i].length; j++) {        // 과목을 반복하여 합계 생성
                sum +=scores[i][j];     // scores[0][0] + scores[0][1] + scores[0][2]...의 0번째 학생의 각 과목 당 배열을 불러와서 합산
            }
            System.out.println(i + 1 + "번 학생의 합계: " + sum);
            System.out.println(i+1 + "번 학생의 평균: " + sum/scores[i].length);

        }



    }
}
