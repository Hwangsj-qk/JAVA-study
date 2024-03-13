package JAVA_240215.method;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "program", "kotlin", "game"};

        // 선택된 단어
        String selectedWord = words[(int) (Math.random() * words.length)];       // [인덱스 번호]

        // 플레이어에게 보여줄 단어의 형태("_"로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';

            int tries = 0;      // 사용자가 시도한 횟수
            final int MAX_TRIES = 7;       // 최대 시도 횟수 (final -> 불변성 확보)
            Scanner scanner = new Scanner(System. in);
            boolean wordCompleted = false;

            // 최대시도 횟수를 넘어서거나, 단어가 완성되면 종료
            while(tries < MAX_TRIES) {
                System.out.print("단어 추측: ");

            }

        }
    }

    private static void printDisplayArray(char[] displayArray) {
        // {'j', '_', '_', '_'}
        for (char c : displayArray) {
            System.out.println(c + " ");
        }
        System.out.println();       // 행 변경
    }

    // 단어가 모두 맞춰졌는지 확인하는 메서드
    private static boolean isWordCompleted(char[] displayArray) {
        // c가 돌면서 못맞춘 '_' 이 부분이 있다면 false 반환, 아니면 true 반환
        for (char c : displayArray) {
            if(c == '_') {
                return false;
            }
        }
        return true;
    }
}
