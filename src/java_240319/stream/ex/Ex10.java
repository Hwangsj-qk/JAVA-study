package java_240319.stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ex10 {
    /*
        연습 문제 2: 학급의 학생 성적 분석
    학급에 속한 학생들의 성적이 주어져 있습니다. 여러분의 목표는 다음 정보를 계산하는 것입니다:

    - 전체 학생의 평균 성적을 계산하세요.
    - 최고 성적을 받은 학생의 성적을 찾으세요.
    - 성적이 평균 이상인 학생의 수를 계산하세요.

    List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

    출력예시
    ===
    평균 성적: 83.625
    최고 성적: 100
    평균 이상 성적 학생 수: 5
     */
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        OptionalDouble average = grades.stream()
                .mapToInt(Integer::intValue)        // 포장 객체이므로 변환이 필요 -> 언박싱
                .average();
        System.out.println("평균 성적: " + average.getAsDouble());

        OptionalInt max = grades.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("최고 성적: " + max.getAsInt());

        long count = grades.stream()
                .mapToDouble(Integer::doubleValue)
                .filter(n -> n >= average.getAsDouble())
                .count();
        System.out.println("평균 이상 성적 학생 수: " + count);
    }
}
