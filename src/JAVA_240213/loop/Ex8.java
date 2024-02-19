package JAVA_240213.loop;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임
        // 1~100까지의 랜덤한 숫자가 있습니다.
        // 응답한 숫자가 낮으면 낮다, 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1~100까지 랜덤한 숫자
        System.out.println(answer);

        // 반목문과 조건문을 통해서 숫자 추측 게임을 만들어보세요.
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int num = scanner.nextInt();
        int n = 1;

//        while(true) {   // true 대신에 num != answer로 해주면 브레이크를 사용하지 않아도 됨
//            if (answer != num) {
//                System.out.println("오답입니다.");
//                System.out.print("숫자를 입력해주세요: ");
//                num = scanner.nextInt();
//            } else {
//                System.out.println("정답입니다.");
//                break;
//
//            }
//        }


            while (n < 10) {
                if (answer != num) {
                    System.out.println("오답입니다.");
                    n++;
                    System.out.print("숫자를 입력해주세요: ");
                    num= scanner.nextInt();


                } else if(answer == num) {
                    System.out.println("정답입니다.");
                    break;
                }
            }
            if(answer != num) {
                System.out.println("오답입니다.");
                System.out.println("입력 횟수를 초과하셨습니다. ");
            } if(answer == num) {
            System.out.println("축하합니다. ");
        }




    }
}
