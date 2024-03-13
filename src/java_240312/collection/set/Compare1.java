package java_240312.collection.set;

import java.util.TreeSet;

public class Compare1 {
    // Comparable 인터페이스
    // java.lang 패키지
    // Comparable 을 구현하는 클래스의 객체들은 '자연스러운 순서로 정렬'될 수 있음
    // 단 하나의 추상 메서드
    // CompareTo(다른 객체)

    // 반환값 (정수)
    // 음수: 이 객체가 저 객체보다 작다.
    // 0: 이 객체와 저 객체는 같다.
    // 양수: 이 객체가 저 객체보다 크다.

    static class Person implements java.lang.Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person otherPerson) {
            // 나이에 따라 정렬 (양수(큼) , 0(같음), 음수(작음))
            return this.age - otherPerson.age;
        }

        @Override
        public String toString() {
            return name + ": " + age;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("임꺽정", 40);
        Person person3 = new Person("전우치", 20);
        Person person4 = new Person("이몽룡", 30);

        // compareTo 메서드에 따라 비교기준 음수, 0, 양수 반환
        int compareInt12 = person1.compareTo(person2);
        int compareInt13 = person1.compareTo(person3);
        int compareInt14 = person1.compareTo(person4);

        System.out.println("compareInt12 = " + compareInt12);
        System.out.println("compareInt13 = " + compareInt13);
        System.out.println("compareInt14 = " + compareInt14);

        // compareTo 기준으로 자동 정렬
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        // 요소 출력으로 확인
        for (Person person : personTreeSet) {
            System.out.print(person);     // 전우치: 20, 홍길동: 30, 임꺽정: 40 -> 기준값(나이)가 중복이면 없어짐
        }
    }
}
