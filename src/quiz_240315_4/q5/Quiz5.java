package quiz_240315_4.q5;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        String sentence = "데이터 분석과 프로그래밍은 매우 재미있어요";

        String[] splitWords = sentence.split(" ");

        String longWord = splitWords[0];

        for (String splitWord : splitWords) {
            if (splitWord.length() > longWord.length()) {
                longWord = splitWord;
            }
        }
        System.out.println(longWord);
    }
}
