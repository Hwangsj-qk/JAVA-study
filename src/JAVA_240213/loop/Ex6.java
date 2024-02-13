package JAVA_240213.loop;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 피보나치 수열 찾기
        // 사용자로부터 정수 n을 입력받아, 피보나치 수열의 첫 n항을 출력하는 프로그램을 작성해보세요.
        // 피보나치 수열에서 다음 항의 앞에 두 항의 합으로 구성됩니다. 
        
        // (예: 0, 1, 1, 2, 3, 5, 8,...)

        Scanner scanner = new Scanner(System.in);
        System.out.print("피보나치 수열의 항 개수: ");
        int n = scanner.nextInt();
        int num1, num2;
        num1 = 0;
        num2 = 1;

        // 첫번째와 두번째 출력
        System.out.print("피보나치 수열: " + num1 + " " + num2);

        for(int i = 3; i <= n; i++) {
            int next = num1 + num2 ;
            System.out.print(" " + next);
            num1 =  num2;  // 두번째 항이 첫번째 항이 됨
            num2 = next;  // 다음항이 두번째 항이 됨
        }

    }
}
