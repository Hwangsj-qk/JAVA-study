package java_240312.collection.set.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    // 중첩 클래스 (Enum)
    public enum SortBy {STUDENT_NO, NAME, AGE, HEIGHT}     // 정렬 기준

    public enum SortDirection {ASC, DESC}      // 정렬 순서

    /*
    Enum의 특징
        1. 클래스처럼 보이게 하는 상수
        2. 서로 관련있는 상수들끼리 모아 상수(대문자!)를 대표할 수 있는 이름으로 타입 정리
            - 열거형 변수들을 선언한 후 세미콜론(;)을 찍지 않는다.
        3. Enum 클래스 형을 기반으로 한 클래스 형 선언
     */


    // 필드(enum 타입으로 필드 생성)
    private SortBy sortBy;
    private SortDirection sortDirection;

    // 생성자

    public StudentComparator(SortBy sortBy, SortDirection sortDirection) {
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }


    // 메서드 : 비교 기준
    @Override
    public int compare(Student s1, Student s2) {
        // 비교기준에 따라 결과를 음수, 0, 양수의 정수로 반환
        int compareResult = 0;
        switch (sortBy) {
            case STUDENT_NO -> compareResult = s1.getStudentNo() - s2.getStudentNo();
            case NAME -> compareResult = s1.getName().compareTo(s2.getName());
            case AGE -> compareResult = s1.getAge() - s2.getAge();
            case HEIGHT -> compareResult = Double.compare(s1.getHeight(), s2.getHeight());
        }
        // 내림차순일 경우 양수와 음수를 스위칭한다.
        if(sortDirection == sortDirection.DESC) {
            compareResult = compareResult * -1;
        }
        return compareResult;
    }

}
