package java_240305.library.lang;

import java.util.Arrays;

public class StringMethod6 {
    public static void main(String[] args) {
        // repeat(int) : count 횟수만큼 문자열 반복
        String bell = "딸랑";

        System.out.println(bell.repeat(2));
        System.out.println(bell.repeat(4));
        System.out.println(bell.concat(" ").repeat(3).trim());
        // 메서드 체이닝에서는 같은 리턴값을 가지는 것이 중요 (bell, concat 의 리턴값, repeat 의 리턴값, trim 의 리턴값 = 문자열)

        // substring(int, int) : 문자열 지정된 부분 문자열 반환
        // 시작 인덱스는 포함, 끝 인덱스는 포함하지 않음
        System.out.println("안녕하세요".substring(2));   // 하세요
        System.out.println("안녕하세요".substring(0,2));   // 안녕

        // 특정 문장에서 찾는 문자열을 잘라낼 경우
        String sentence = "무궁화 꽃이 피었습니다. ";
        System.out.println(sentence.substring(0,3));     // 무궁화
        String findText = "꽃이";
        System.out.println(sentence.substring(sentence.indexOf(findText),   // 시작 인덱스
                sentence.indexOf(findText) + findText.length()));       // 끝 인덱스(시작 인덱스 + 길이)
        // 결과값: 꽃이

        // replace : 치환, 지정된 문자열에서 다른 문자를 교체한 새 문자열 반환
        System.out.println("안녕하세요".replace("안녕", "평안"));    // 평안하세요

        String hello = "안녕하세요, 저는 안녕합니다";
        System.out.println(hello.replace("안녕", "평안"));
        // 평안하세요, 저는 평안합니다. -> 모든 문자열을 교체
        System.out.println(hello);  // 원본은 훼손하지 않음

        // split : 지정된 구분자로 배열을 반환
        String memo = "사과,체리,바나나,딸기,복숭아";
        String [] fruits = memo.split(",");
        System.out.println(Arrays.toString(fruits));    // [사과, 체리, 바나나, 딸기, 복숭아] => 배열 형식

        String todos = "청소하기 빨래하기 출근하기 잠자기";
        String[] todoArray = todos.split(" ");
        for (int i = 0; i < todoArray.length; i++) {
            System.out.println(todoArray[i]);
        }

        // 향상된 for 문 활용하기
        for (String todo : todoArray) {
            System.out.println(todo);
        }
    }
}
