package JAVA_240213.loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 은행앱
        /*
        -------------------------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        -------------------------------------------------
        선택 >
        1. 1번ㅇ르 선택할 경우
           예금액 > 10000  -> 잔고에 10000원이 입금
        2. 2번을 선택할 경우
           출금액 > 1000  -> 잔고에서 1000원 출금
        3. 3번을 선택할 경우
            잔고액 > 9000  -> 잔고액 확인 가능
        4. 4번을 선택할 경우
            "프로그램이 종료됩니다."
         */

        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        int b = 0;


        while(isRun) {
            System.out.print("번호를 입력해주세요: ");
            int num = scanner.nextInt();

            if(num == 1){
                b = b+10000;
                System.out.println("10000원을 입금합니다.");
                System.out.println("잔고: " + b);
            } else if (num == 2) {
                b= b-1000;
                System.out.println("1000원을 출금합니다.");
                System.out.println("잔고: " + b);
            }else if(num ==3 ) {
                System.out.println("현재 남은 잔고: " + b);
            } else if (num == 4) {
                System.out.println("어플을 종료합니다.");
                isRun = false;

            }
        }
    }
}
