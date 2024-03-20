package java_240319.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(
                List.of(7,4,5,6,3, 2, 0,9,8,1,6)
        );

        // 데이터에서 홀수만 골라내서 1,3,5,,, 와 같은 문자열로 변경

        // 1. 반복문을 사용하는 방식
        // 1-1. 홀수 골라내기

        List<Integer> oddList = new ArrayList<>();
        for (Integer n : numberList) {
            if(n % 2 == 1) {
                oddList.add(n);
            }
        }
        System.out.println("oddList = " + oddList);     // [7, 5, 3, 9, 1]

        // 1-2. 정렬하기(새로운 Comparator 생성)
        oddList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println("oddList = " + oddList);     // [1, 3, 5, 7, 9]

        List<String> oddStringList = new ArrayList<>();
        // 결과를 담을 새로운 list 생성

        // 1-3. 문자열로 연결하기
        for (Integer n : oddList) {
            oddStringList.add(valueOf(n));
            // 숫자를 '문자로 변경'하여 List에 담기
        }
        System.out.println("oddStringList = " + oddStringList);     //  [1, 3, 5, 7, 9] (문자열)

        // join : String 정적 메서드 조인(구분자, 반복가능데이터) (구분자로 문자열 연결)
        String joinString = String.join(" // ", oddStringList);
        System.out.println("joinString = " + joinString);       // => 1 // 3 // 5 // 7 // 9

        // 2. 스트림 API를 사용한 방식
        String finalString = numberList.stream()     // 데이터의 스트림화
                .filter(number -> number % 2 == 1)      // 중간 연산: 홀수만 찾기
                .sorted(Integer::compareTo)
//                        .sorted((number1, number2) -> Integer.compare(number1, number2)     // 중간 연산: 오름차순 정렬
                .map(String::valueOf)  // 중간연산: 문자열로 바꾸기
                // valueOf(): 괄호 안 객체를 String으로 변환
                .collect(Collectors.joining("/ "));// 최종 연산; 구분자로 연결해서 반환

        System.out.println("finalString = " + finalString);     // 1/ 3/ 5/ 7/ 9



    }
}
