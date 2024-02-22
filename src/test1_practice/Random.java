package test1_practice;

import java.util.Scanner;

public class Random {
    // loop - ex8
    public static void main(String[] args) {
        Random random = new Random();
        int answer = (int) (Math.random() * 100) + 1; // 1~ 100까지 랜덤한 숫자

        System.out.println(answer);

        // 반복문과 조건문을 통해서 숫자 추측 게임 만들기
        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        int tryCount = 0;

        do {
            // 질문 및 프롬프트
            System.out.println("1~100 중에서 숫자를 맞춰보세요 ");
            guessNumber = scanner.nextInt();
            tryCount++;

            if (guessNumber > answer) {
                System.out.println("오답! down 하세요!");
            } else if (guessNumber < answer) {
                System.out.println("오답! up 하세요!");
            }
        }while (guessNumber != answer);

        System.out.println("정답을 맞추셨네요! 축하드려요!" + tryCount + "번만에 맞추셨네요!");

        // 탐색하는 숫자를 절반씩 줄여가는 방법: 이진 탐색(binarySearch)


        }

    }


