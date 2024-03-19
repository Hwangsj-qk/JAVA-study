package java_240319.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
         List<Student> studentList = new ArrayList<>();
         studentList.add(new Student("홍길동", 80));
         studentList.add(new Student("홍길동", 95));
         studentList.add(new Student("홍길동", 92));

         // 학생 객체 스트림에서 score 만 사용하는 정수 스트림으로 변환
         studentList.stream()
                 .mapToInt(student -> student.getScore())
                 .forEach(System.out::println);

         // 학생 객체의 평균 구하기
        double average = studentList.stream()                // 생성 : 학생 객체 스트림
                .mapToInt(student -> student.getScore())        // 중간: 점수 정수 스트림
                .average()    // 최종 : 점수의 평균 => Optional 리턴
                .getAsDouble();     // Optional 타입에서 값 꺼내기
        System.out.println("average = " + average);

        // 기본 타입 간의 변환 메서드
        // asLongStream, asDoubleSteam
        int [] intArray = {1,2,3,4,5};
        IntStream stream = Arrays.stream(intArray);

        stream.asDoubleStream()                     // 중간: 실수 스트림으로 변환
                .forEach(System.out::println);      // 최종: 출력(정수 -> 실수)

        // flatMap : 하나의 요소를 여러 개의 요소로 변환한 스트림을 반환
        List<String> stringList = new ArrayList<>(
                List.of("hello, Java and Steam",     // ["hello", "java", "and"...]
                        "I am Developer")           // ["I", "am", "Developer"]
        );                                          // => ["hello",..."I",...]

        // 문자 스트림을 잔어 스트림으로 변환하여 출력
        stringList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))   // function 람다식
                .forEach(System.out::println);
    }
}
