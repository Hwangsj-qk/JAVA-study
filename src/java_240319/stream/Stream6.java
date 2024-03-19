package java_240319.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream6 {
    // 요소 정렬
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("아자차", 80));
        studentList.add(new Student("가나다", 95));
        studentList.add(new Student("마바사", 92));

        studentList.stream()        // 스트림 생성
                .sorted()       // 중간: 정렬(Comparable)
                // Comparator 매개변수로 하는 방법 or Comparable 인터페이스 구현 -> Student 클래스에서
                .map(Student::getName)      // 중간: 이름 필드 스트림으로 변환
                .forEach(System.out::println);      // 최종 출력

        // 자연 순서(이름순으로 오버라이딩)에서 역순으로 정렬하기
        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .map(Student::getName)
                .forEach(System.out::println);

        // 최종연산: collect() -> 원하는 자료형으로 변환
        List<String> nameList = studentList.stream()
                .sorted()
                .map(Student::getName)
                .collect(Collectors.toList());

        Set<String> scoreSet = studentList.stream()
                .sorted()
                .map(Student::getName)
                .collect(Collectors.toSet());

    }
}
