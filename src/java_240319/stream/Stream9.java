package java_240319.stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9 {
    // 스트림의 집계 연산 Aggregate
    // 최종 연산
    // 스트림 내부 요소들을 처리해서, 하나의 값으로 산출하는 것을 말함
    // 대량의 데이터를 가공해서, 하나의 값으로 축소 => reduce 또는 Reduction

    // 기본 집계 연산 : count, min, max, average, sum

    public static void main(String[] args) {
        // count : 요소의 개수를 반환
        long count = Stream.of("홍길동", "김철수", "둘리", "장사장").count();
        System.out.println("count = " + count);         // 4

        // max : 최대값을 반환 => Optional 타입 반환(포장이 한 번 더 되어 있다고 생각하면 됨)
        int[] intArray = {1,2,3,4,5};
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println("max = " + max.getAsInt());     // 5
        
        // min : 최소값 반환 => Optional 타입 반환(포장이 한 번 더 되어 있다고 생각하면 됨)
        OptionalInt min = Arrays.stream(intArray).min();
        System.out.println("min.getAsInt() = " + min.getAsInt());       // 1

        // min, max 는 Comparable 구현 객체가 아닐 때, Comparator를 매개변수로 받는다.
        Optional<String> minString = Stream.of("김수한무거북이", "김철수", "둘리", "장사장")
                .min(Comparator.naturalOrder());        // 가나다 순 (자연순)

        Optional<String> maxString = Stream.of("김수한무거북이", "김철수", "둘리", "장사장")
                .max((o1, o2) -> {
                    return o1.length() - o2.length();
                });
        System.out.println("가나다순 가장 첫 번째 이름: " + minString.get());

        System.out.println("길이순 가장 긴 이름: " + maxString.get());

        // sum : 스트림 요소 합계, 정수, 실수 등의 숫자 스트림에서 사용 가능
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("1부터 100까지 합계 = " + sum);

        double doubleSum = DoubleStream.of(1.1, 2.2, 3.3).sum();
        System.out.println("doubleSum = " + doubleSum);

        // average : 스트림 요소 평균 / 정수, 실수 등의 숫자 스트림에서 사용 가능
        // 리턴 값: OptionalDouble
        OptionalDouble average = IntStream.rangeClosed(1, 100).average();
        System.out.println("average = " + average.getAsDouble());

        // 첫번째 요소 찾기
        OptionalInt first = IntStream.rangeClosed(1, 100)
                .skip(50)
                .filter(n -> n % 11 == 0)
                .findFirst();
        System.out.println("50 이후 11의 배수 중 첫번째: " + first.getAsInt());

    }

}
