package JAVA_240208.condition;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* 계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월~5월까지 "봄", 6월~8월가지는 "여름",
        9월~11월까지는 "가을", 12월 ~ 2월까는 "겨울"입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하세요.");
        int mon = scanner.nextInt();

        if (mon>= 3 && mon <= 5) {          // if(mon == 3 | mon == 4 | mon == 5)도 가능
            System.out.println("봄입니다.");
        } else if (mon >= 6 && mon <= 8) {
            System.out.println("여름입니다.");
        } else if (mon >= 9 && mon <= 11) {
            System.out.println("가을입니다.");
        } else if (mon == 1 | mon == 2 | mon ==12){
            System.out.println("겨울입니다.");
        }
    }
}
