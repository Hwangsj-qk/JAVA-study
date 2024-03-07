package java_240305.library.lang.ex;

import java.util.Scanner;

public class Ex11 {
    /*
        연습문제: 가장 긴 단어 찾기

    요구사항:
    사용자로부터 한글 문장을 입력받아,
    문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    단어는 공백으로 구분됩니다.

    예시 입력
    ===
    데이터 분석과 프로그래밍은 매우 재미있어요

    예시 출력
    ===
    프로그래밍은
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문장을 입력하세요: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longWord = words[0]; // 여기 공백을 줘서 향상된 for 문 사용해도 가능
        // 여기서 초기값을 null을 주면 NPE의 가능성이 있다.
        for (int i = 0; i < words.length; i++) {

            if (longWord.length() < words[i].length()) {
                longWord = words[i];
            }
        }

        System.out.println(longWord);
    }
}
