package JAVA_240214.array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값을 구하기
        // 정수를 n개 입력받아 배열에 저장하고,
        // 그 중 가장 큰 수와 가장 작은 수를 구하는
        // 프로그램을 작성해보세요.
//         예시
//        입력받을 숫자 : 4
//        4개의 정수를 입력하세요
//        76
//        5
//        23
//        9
//        최대값 : 76, 최소값 : 5

        Scanner scanner = new Scanner(System.in);

        // 입력받을 배열의 길이 받기
        System.out.print("입력받을 숫자의 개수를 입력해주세요 > ");
        int n = scanner.nextInt();

        // 배열 선언 및 최대값, 최소값 선언
        int[] array = new int[n];
        int max;     // 첫번째 요소를 선택하여 대입
        int min;     // 첫번째 요소를 선택하여 대입

        // 배열의 입력
        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();       // array[0], array[1],...,array[n]까지 받아서 입력
        }

        max = array[0];
        min = array[0];

        // 최대값 구하기
        for (int i : array) {
            if ( i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        // 최소값 구하기
        for (int i : array) {
            if(i < min){
                min = array[i];     // 이렇게 하면 작동됨
            }
        }
        System.out.println("min = " + min);
        System.out.println("최댓값: " + max + " 최소값: "  + min);
    }

}


