package java_240312.collection.set.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Student 홍길동 = new Student("홍길동", 30, 170.0);
        Student 임꺽정 = new Student("임꺽정", 40, 185.4);
        Student 전우치 = new Student("전우치", 25, 175.6);
        Student 허생 = new Student("허생", 35, 168.9);

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.addAll(
                Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
        );

        // 학번 순 정렬
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }
        // 이름 순 정렬
        System.out.println("====== 이름 순 정렬 =====");
        StudentComparator nameStudentComparator =
                new StudentComparator(
                        StudentComparator.SortBy.NAME,
                        StudentComparator.SortDirection.ASC);
        // 정렬 기준으로 이름 비교자
        TreeSet<Student> nameSortSet = new TreeSet<>(nameStudentComparator);
        // 정렬 대상 삽입
        nameSortSet.addAll(
                Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
        );
        for (Student student : nameSortSet) {
            System.out.println(student);
        }

// 배열로 만들기 (배열 안에 두개의 TreeSet 입력)
        TreeSet[] treeSets = {
                new TreeSet<>(
                        // 나이순 정렬 (내림차순)
                        new StudentComparator(
                                StudentComparator.SortBy.AGE,
                                StudentComparator.SortDirection.DESC
                        )
                ),
                // 키 순 정렬 (내림차순)
                new TreeSet<>(
                        new StudentComparator(
                                StudentComparator.SortBy.HEIGHT,
                                StudentComparator.SortDirection.DESC
                        )
                )
        };
        // 두개의 TreeSet 안에 먼저 자료 입력
        for (TreeSet<Student> treeSet : treeSets) {
            treeSet.addAll(
                    Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
            );
            System.out.println("========================");
            // 두개의 TreeSet 출력
            for (Student student : treeSet) {
                System.out.println(student);
            }
        }

    }
}
