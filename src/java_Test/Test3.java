package java_Test;

import java_240220.access_modifier.Radio;
import test1_practice.Random;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = (int)(Math.random() * 100 ) + 1;

        Scanner scanner = new Scanner(System.in);

        int tryCount = 0;

        System.out.println("1~ 100까지 숫자 중 맞춰보세요");
        System.out.print("숫자를 입력하세요: ");
        int tryNumber = scanner.nextInt();
        tryCount++;
        do {
           if(answer < tryNumber) {
               System.out.println("오답! down 하세요.");
           } else {
               System.out.println("오답! up 하세요. ");
           }

        } while (answer != tryNumber);

        System.out.println("정답!" + tryCount + "번에 맞추셨네요!");
    }
}
