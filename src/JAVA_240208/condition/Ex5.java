package JAVA_240208.condition;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /* 주차요금 계산하는 프로그램
        응용문제: 주차요금 계산기
        주차장을 사용한 시간(시간 단위)을 사용자로부터 입력받아, 주차요금을 계산하는 프로그램을 작성하세요.
        기본 요금은 2시간까지 5000원이고, 이후부터는 30분마다 1000원씩 추가 요금이 발생합니다.
        24시간을 초과하는 주차의 경우에는 일일 최대 요금인 30000원을 적용하세요.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("주차할 시간을 입력하세요: ");
        int hour = scanner.nextInt();

        if (hour >= 2) {
            System.out.print("주차요금: 2000원");
        } else if(hour < 2 && hour <= 24) {
            System.out.println(5000);
        }





    }
}
