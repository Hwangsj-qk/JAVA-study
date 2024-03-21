package java_240319.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11 {
    // 스트림 요소 수집하기 collect()
    // 유연한 최종연산 : collector 인터페이스의 구현을 매개변수로 받아 작업
    // Collector <T, A, R> collector
    // T : 스트림의 요소
    // A : accumulator 누산기 (T 타입의 요소를 A 누산기가 누적해서 R타입에 저장한다.)
    // R : 반환될 컬렉션


    public static void main(String[] args) {
        record Student(String name, String gender, int age) {}

        List<Student> studentList = new ArrayList<>(
                Arrays.asList(
                        new Student("홍길동", "남", 30),
                        new Student("김영희", "여", 25),
                        new Student("이철수", "남", 20),
                        new Student("오해영", "여", 28)
                )
        );

        // toList : 리스트로 수집
        List<Student> manList = studentList.stream()
                .filter(student -> student.gender().equals("남"))
                .collect(Collectors.toList());// R이 list 형태

        // toSet : Set으로 수집, 중복제거할 때 유용
        Set<Student> manSet = studentList.stream()
                .filter(student -> student.gender().equals("남"))
                .collect(Collectors.toSet());// R이 set 형태

        // toMap : 키, 값 쌍으로 함수를 통해 각 요소에서 추출
        Map<String, Integer> manMap = studentList.stream()
                .filter(student -> student.gender().equals("남"))
                .collect(Collectors.toMap(Student::name, Student::age));
        // Map은 괄호 안에 키값과 벨류값을 정해줘야 함

        System.out.println("manList = " + manList);
        System.out.println("manSet = " + manSet);
        System.out.println("manMap = " + manMap);

        System.out.println("\n=============================\n");

        // joining : 스트림의 문자열 요소를 하나의 문자열로 만든다.
        // 구분된 문자열을 단일 문자열 연결로 만들 때 유용,
        // JSON, HTML 문자열로 만들 때 사용
        Stream<String> stringStream = Stream.of("자바", "스트림", "람다식");
        String join1 = stringStream.collect(Collectors.joining());
        System.out.println("join1 = " + join1);

        String join2 = Stream.of("자바", "스트림", "람다식")
                .collect(Collectors.joining(", "));
        System.out.println("구분자를 첫번재 인자로 조인한 문자열: " + join2);

        String join3 = Stream.of("자바", "스트림", "람다식")
                .collect(Collectors.joining(" / ", "[", "]"));
        System.out.println("접두사와 접비사를 사용해서 조인한 문자열: " + join3);

        System.out.println("\n======================================\n");

        // groupingBy : 요소 그룹핑
        // 분류기(Function 람다식)를 기준으로 타입 T를 Key K로 매핑하고
        // List<T>를 V value 로 갖는 Map 컬렉션을 생성
        Map<String, List<Student>> genderMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::gender));

        System.out.println("genderMap = " + genderMap);

        // key를 기준으로 List를 분류할 수 있다.
        List<Student> maleList = genderMap.get("남");
        List<Student> femaleList = genderMap.get("여");

        System.out.println("maleList = " + maleList);
        System.out.println("femaleList = " + femaleList);

        System.out.println();

        // 두번째 매개변수 Collector 를 사용해서 집계 메서드를 사용할 수 있음
        // -> summing, averaging, counting
        Map<String, Double> genderAgeMap = studentList.stream()
                // 성별 그룹별로 나이를 평균한 값
                .collect(Collectors.groupingBy(student -> student.gender,
                        Collectors.averagingDouble(Student::age)
                ));
        System.out.println("genderAgeMap = " + genderAgeMap);

        System.out.println();

        // Mapping : 스트림의 요소를 변환한 후, 다른 컬레터에서 수집
        // 인자1 : mapper - 변환
        // 인자2 : collector - 컬렉션으로 수집
        List<String> nameList = studentList.stream()
                .collect(Collectors.mapping(Student::name, Collectors.toList()));

        System.out.println("nameList = " + nameList);

        // partitioningBy :  스트림 요소를 특정한 기준에 따라
        // true 와 false 양쪽으로 나누는 Map을 반환
        Map<Boolean, List<Student>> age25Map = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.age > 25));

        System.out.println();

        List<Student> over25students = age25Map.get(true);
        List<Student> under25students = age25Map.get(false);

        System.out.println("over25students = " + over25students);
        System.out.println("under25students = " + under25students);
    }
}