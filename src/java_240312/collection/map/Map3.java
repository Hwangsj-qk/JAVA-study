package java_240312.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map3 {
    static class Student {
        public int studentNo;
        public String name;

        public Student(int studentNo, String name) {
            this.studentNo = studentNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentNo=" + studentNo +
                    ", name='" + name + '\'' +
                    '}';
        }

        // 동등성 비교(equals(), hashCode())
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentNo == student.studentNo && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentNo, name);
        }
    }

    public static void main(String[] args) {
        // key 에 참조타입 객체 (사용자 정의 타입)이 HashMap에 사용되면
        // 동등성을 확인하는 로직으로 equals와 hashCode를 오버라이딩 해야 한다.
        Map<Student, Integer> studentMap = new HashMap<>();

        studentMap.put(new Student(1, "홍길동"), 90);
        studentMap.put(new Student(1, "홍길동"), 95);

        System.out.println(studentMap.size());      // 2
        // 두 개의 홍길동은 주소가 달라서 가져오는 참조값이 다르기 때문에 컴퓨터 입장에서는 다른 key로 인식
        // 같은 걸로 인식하게 하기위해선 hashCode() 와 equals() 오버라이딩 해주기
        System.out.println(studentMap);

    }
}
