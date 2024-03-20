package java_240319.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream10 {
    // reduce : 다양한 Reduction을 커스터마이징 할 수 있는 메서드
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(
                List.of(new Student("홍길동", 92),
                        new Student("임꺽정", 88),
                        new Student("이몽룡", 95))
        );

        int sum = studentList
                .stream()                   // 학생 객체 스트림
                .mapToInt(Student::score)   // 점수 정수 스트림 변환
                .sum();
        System.out.println("sum = " + sum);

        // reduce의 매개변수
        // identity : 디폴트 값으로 설정
        // 누산기(accumalator)BinaryOperator : 2개의 값을 받아서 하나를 리턴 (모든 타입이 동일)
        Integer sum2 = studentList.stream()
                .map(Student::score)
                .reduce(0,
                        (a, b) -> a + b
                        // identity가 있으면 첫 시작이 0
                        // -> 0+92= 92, 92 + 88 = 180, 180 + 95 = 275
                        // arg1 : 이전 출력값이 다음 스트림의 입력값으로 대입 (누적된 결과)
                        // arg2 : 데이터의 흐름(스트림)의 입력값 (현재 요소)
                );
        System.out.println("sum2 = " + sum2);

        System.out.println("=================================");

        OptionalInt reduce = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 1)
                .reduce((previous, current) -> {
                    System.out.printf("%d * %d = %d\n", previous,current,previous*current);
                    return previous * current;
                });
        System.out.println("1부터 10까지 홀수만 곱한 값: " +  reduce.orElse(1));
        System.out.println("=====================================");

        // 초기값이 주어지는 경우 첫번재 값을 초기값으로
        // 곱셉 연산시 0이 주어지지 않도록 주의
        // (기본) 곱셈 연산 초기값: 1, 덧셈 연산 초기값: 0
        int reduceResultWithIdentity = IntStream.rangeClosed(1, 10)
                .reduce(2, (previous, current) -> previous * current);
        // identity : 초기값 -> 2 * 1 = 2, 2*2 = 4,....
                        // identity : 1 => 1*1 = 1, 1*2= 2,...
        System.out.println("reduceResultWithIdentity = " + reduceResultWithIdentity);

        List<String> words = Arrays.asList("가나", "다라마", "아자차카");

        Integer lengthTotal = words.stream()
                .map(String::length)
                .reduce(0, Integer::sum);       // 문자열 길이 정수로 매핑
        System.out.println("=========================");        // 각각 더해주는 Reduction 연산
        System.out.println("모든 문자열의 길이: " + lengthTotal);
    }

    record Student(String name, int score) {}
}
