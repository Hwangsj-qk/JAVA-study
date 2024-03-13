package JAVA_240215.method;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
        성적을 관리하는 프로그램
         1. 새로운 성적을 배열에 추가
         2. 성적의 평균을 계산
         3. 최고 성적을 조회
         4. 성적 분포를 출력 (A, B, C, D, F) (90, 80, 70, 60, 60이하
         */

        int [] scores = new int[0];

        Scanner scanner = new Scanner(System.in);
        // 1. 동적인 배열의 증가
        while (true) {
            System.out.print("성적을 입력하세요 (종료: -1 입력) : ");
        }

    }

    public static int [] addScores(int [] scores, int score) {
//         성적을 추가하는 메서드
        int [] newScores = new int[scores.length + 1];
        // 추가해야하므로 이전 배열 보다 1 크게 만들어야 함
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
            // 기존의 배열을 순회하며 새로운 배열에 내용을 복사 한다.
        }
        newScores [newScores.length -1] =score;
        // 배열의 마지막 인덱스에 새로운 값 추가
        scores = newScores;
        // 기존 배열을 새로운 배열로 대체
        return scores;
    }

    public static double calculateAverage(int [] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        // 평균을 계산하는 메서드
        return sum/scores.length;
    }

    public static void printScoreDistribution(int scores[]) {
        int [] distribution = new int[5];
        // 성적 분포를 담는 배열

        // 성적 분포 출력 메서드
        for (int score : scores) {
            distribution[0] ++;
        }

    }
}
