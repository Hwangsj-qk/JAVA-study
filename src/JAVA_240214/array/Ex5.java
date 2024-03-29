package JAVA_240214.array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);

        // 배열 선언
        int[][] scores = new int[3][3];   // 3행 3열 배열

        // 점수 입력
        for (int[] students : scores) {
            System.out.println("학생의 성적을 입력하세요");
            for (int i = 0; i < students.length; i++) {
                System.out.println("점수: ");
                students[i] = scanner.nextInt();
            } {

            }
        }
        // 총점과 평균 구하기
            for (int i = 0; i < scores.length; i++) {     // i = 학생 수
                int sum = 0;    // 학생마다 sum의 점수가 다르므로 반복문 안에서 선언
                for (int j = 0; j < scores[i].length; j++) {
                    sum += scores[i][j];    // [0][0] + [0][1] + [0][2] 의 합계
                }
                System.out.println(i + 1 + "번 학생의 합계: " + sum);
                System.out.println(i + 1 + "번 학생의 평균: " + sum/scores[i].length);
            }


            }


        }


