package JAVA_240214.array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 선형탐색 Linear Search
        // 정수 배열에 임의의 정수들이 존재합니다.
        // 해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
        // 특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요

        int[] numbers = {10,54,23,45,8,5};

        // 배열을 출력
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        // 찾는 값을 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾는 값을 입력하세요 > ");
        int search = scanner.nextInt();     // 찾는 값
        boolean found = false;      // 탐색 여부를 확인하는 플래그

        // 선형 탐색법으로 위치를 찾음
        for (int i = 0; i < numbers.length; i++) {      // 지금은 i가 필요하기 때문에 향상된 for문은 사용하기 어려움
            if(numbers[i] == search) {
                System.out.println("배열의 " + (i + 1) + "번째 위치에 존재합니다. ");
                found = true;
            }
            System.out.println(i);
        }       // i는 0,1,2,3,4... -> numbers[0] = 10 -> 결국 값을 가지고 옴


        if ( ! found) {     // found 안에 존재하지 않는다면
            System.out.println("배열에 존재하지 않습니다. ");
        }

    }
}
