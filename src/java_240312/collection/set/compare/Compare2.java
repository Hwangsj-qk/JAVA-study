package java_240312.collection.set.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class Compare2 {
    // Comparator 인터페이스 - List2 마지막 부분과 같이 보기
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return name + ": " + age;
        }
    }

    public static void main(String[] args) {
        // 비교자 Comparator 정의 : 익명 객체로 인터페이스 본문 선언
        Comparator<Person> nameComparator = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                // 나이 비교
                //return o1.age - o2.age;
                // 이름 비교 : 문자열(Comparable) 필드의 비교 방법을 사용하여 비교
                return o1.name.compareTo(o2.name);
            }

        };

        // 이름 비교자를 사용한 정렬
        TreeSet<Person> treeSet = new TreeSet<>(nameComparator);
        // () 안에는 비교자를 넣거나 or 파라미터 입력을 하지 않거나

        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("임꺽정", 40);
        Person person3 = new Person("전우치", 20);
        Person person4 = new Person("이몽룡", 30);

        // 새로운 요소가 삽입될 때마다 (이름 기준으로) 비교하여 정렬
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);
        treeSet.add(new Person("홍길동", 50));     // 이름 기준 중복 불허용

        for (Person person : treeSet) {
            System.out.println(person);
            // 이몽룡 -> 임꺽정 -> 전우치 -> 홍길동 (가나다순)
        }
    }
}
