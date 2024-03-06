package java_240305.library.lang.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    /*
    요구사항:
당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
사용자로부터 한 줄의 문자열을 입력받아,
다음과 같은 정보를 출력하는 프로그램을 작성하세요.

- 입력받은 문자열의 길이.
- 문자열에서 공백의 수.
- 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
- 문자열이 "Java"를 포함하는지 여부.
- 문자열이 "프로그래밍"으로 끝나는지 여부.
- 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)

입력 예시 문자열
===
Java 프로그래밍, 문자열 처리 연습

출력 예시
===
문자열 길이: 24
공백 수: 3
각 부분 문자열 길이: [13, 8, 2]
"Java" 포함 여부: true
"프로그래밍"으로 끝나는가: false
"a" 문자의 수: 2
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문장을 입력하세요: ");
        String sentence = scanner.next();

        // 문자열의 길이
        System.out.println("문자열 길이: " + sentence.length());

        // 공백의 수

        // 각 부분의 문자열 길이
        String [] words = sentence.split(",");
//        System.out.println(Arrays.toString(words));

        // "java"를 포함하는지 여부
        System.out.println("'Java' 포함 여부: " +  sentence.contains("Java"));

        // 문자열이 "프로그래밍"으로 끝나는지 여부
        System.out.println("'프로그래밍'으로 끝나는가: " + sentence.endsWith("프로그래밍"));

        // 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구문 없음)
        String findText = "a";
        System.out.println(sentence.indexOf("a"));






    }
}
