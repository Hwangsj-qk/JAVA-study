package JAVA_240215.method;

public class Ex6 {
    public static void main(String[] args) {
        int scores [] = new int[0];     // 비어 있는 배열로 시작

        // 성적을 관리하는 프로그램
        // 1. 새로운 성적을 배열에 추가
        // 2. 성적의 평균을 계싼
        // 3. 최고 성적을 조회
        // 4. 성적 분포를 출력(A, B, C, D, F)(90, 80, 70, 60, 60점 이하)
    }
    public static int[] addScore(int[] scores, int score) {
        // 성적을 추가하는 메서드
        int[] newScores = new int[scores.length + 1];   // 이전 배열보다 길이가 1만큼 긴 배열 생성
        for (int i = 0; i < scores.length; i++) {
            newScores[i]  = scores[i];

        } // 기존의 배열을 순회하며 새로운 배열에 내용을 복사 한다.

        newScores[newScores.length-1] = score;  // 배열의 마지막 인텍스에 새 값을 추가
        scores = newScores;     // 기존 배열을 새로운 배열로 대체한다.
        return scores;


    }
    public static double calculateAverage(){
        // 평균을 계산하는 메서드
        return 0.0;

    }
    public static int findMaxGrade() {
        // 최고 성적 조회 메서드
        return 0;

    }
    public static void printScoreDistribution() {
        // 성적 분포 출력 메서드
    }
}
