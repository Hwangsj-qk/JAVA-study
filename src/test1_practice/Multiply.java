package test1_practice;

public class Multiply {
    // loop-ex3

    public static void main(String[] args) {
        // 구구단 출력하기
        // 사용자로부터 정수 n을 입력받아,
        // n단의 구구단을 출력하는 프로그램을 작성해주세요.

        int multiply = 1;
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +  " * " +  j +  " = " + i*j);
            }

        }
    }
}
