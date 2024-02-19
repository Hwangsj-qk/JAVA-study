package JAVA_240214.array;

public class Ex4 {
    public static void main(String[] args) {
        // 2차원 배열의 합계 구하기
        // 2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.

        int [][] matrix = new int[10][10];

        int i = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = i++;

            }

        }
            //2차원 배열 출력: 향상된 for문 사용



    }
}
