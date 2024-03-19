package java_240319.stream;

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        // Comparator 인터페이스의 디폴트 메서드 사용
        // Comparator.comparing(클래스명::필드명)
        // 특정 필드, 특정 속성 기준으로 객체를 정렬할 때 사용
        List<Person> personList = new ArrayList<>(
                Arrays.asList(new Person("홍길동", 30),
                        new Person("홍길동", 24),
                        new Person("이순희", 24),
                        new Person("김철수", 40))
        );

        personList.stream()
                // 나이 기준으로 정렬하기
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println("==================================");

        personList.stream()
                // 이름 기준으로 정렬하기
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("==================================");

        // Comparator.thenComparing : 주 정렬조건이 같을 때 추가 정렬 조건을 제공
        personList.stream()
                // 이름 -> 나이 (오름차순)
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println("=======================================");

        // Comparator.reversed() 정렬 순서를 역순
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        // 나이 기준 내림차순으로 정렬
                        .reversed())
                .forEach(System.out::println);


        // Comparator.comparingInt : 특정한 기본 타입 기준으로 정렬하고 싶을 때
        List<String> stringList = Arrays.asList("x", "xxx", "xx");
        stringList.stream()
                .sorted(Comparator.comparingInt(String::length))        // 리턴은 무조건 int, 매개변수는 String 타입
                .forEach(System.out::println);

        // null 값이 있는 경우
        List<String> nameList = Arrays.asList("홍길동", null, "김철수", "이영희");

        // Comparator.nullsFirst : null 값이 제일 앞에 위치
        // Comparator.naturalOrder() : 자연순 -> Comparable 기준
        nameList.stream()
                // null이 제일 앞에 오고 나머지는 자연순서로 정렬
                .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
                .forEach(System.out::println);

        // Comparator.nullsLast : null 값이 제일 뒤에 위치
        // Comparator.reverseOrder() : 역순 -> Comparable 의 내림차순
        nameList.stream()
                // null이 제일 뒤에 오고 나머지는 자연순서로 정렬
                .sorted(Comparator.nullsLast(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " :  " + age;
        }
    }
}
