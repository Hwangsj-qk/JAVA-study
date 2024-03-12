package java_240312.collection.list;

import java.util.ArrayList;
import java.util.List;
public class List1 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크의 핵심 인터페이스 중 하나
        // 구현 클래스
        // ArrayList: list이지만 내부적으로는 Array 구조 -> 빠르다는 장점이 있음 그러면서 List의 간편한 메서드를 사용할 수 있음
        // LinkedList
        // vector
        // stack
        // 특징
        // 순서가 있는 데이터의 집합을 다룸
        // 중복된 요소를 허용

        List<String> names = new ArrayList<>();     // 길이 10짜리 배열 생성
        names.add("홍길동");       // 리스트 맨 끝에 객체를 추가
        names.add("임꺽정");
        names.add("이몽룡");

        System.out.println(names);      // [홍길동, 임꺽정, 이몽룡]

        names.add(1, "이순신");        // 해당 인덱스 위치에 객체 추가

        System.out.println(names);      // [홍길동, 이순신, 임꺽정, 이몽룡]

        names.set(2, "전우치");        // 특정 인덱스의 객체를 변경

        System.out.println(names);      // [홍길동, 이순신, 전우치, 이몽룡] -> 임꺽정 대시 전우치가 인덱스 2번으로 변경

        // 요소 접근
        System.out.println(names.get(3));       // 이몽룡
        System.out.println(names.indexOf("전우치"));

        // 객체 저장 여부 확인 -> boolean
        System.out.println(names.contains("이순신"));      // true
        System.out.println(names.contains("이율곡"));      // false

        // 저장되어 있는 전체 객체 수
        System.out.println("저장된 객체 수: " + names.size());        // 4

        // isEmpty : 컬렉션이 비어있는 지 여부
        System.out.println("컬렉션이 비어 있는지 여부 : " + names.isEmpty());      //false

        // 요소 제거
        names.remove("임꺽정");
        System.out.println(names);      // 객체로 삭제
        names.remove(2);
        System.out.println(names);      // 인덱스로 삭제

        // 컬렉션 요소 전체 삭제
        names.clear();
        System.out.println(names);
        System.out.println("컬렉션이 비어 있는지 여부 : " + names.isEmpty());      // true


        // 데이터가 실제 들어있는 만큼 용량이 조정 (NPE 예방)
        for (String name : names) {
            System.out.println(name.length());
        }

        List<Integer> numbers = new ArrayList<>(20);        // 길이 20짜리 배열 생성

        // 배열과의 차이점: 저장 용량(capacity) 자동으로 증가
        // 객체를 저장할 대 자동으로 인덱스가 부여됨
        String [] nameArray = new String[10];
        nameArray[0] = "이름1";
        nameArray[1] = "이름2";
        nameArray[2] = "이름3";

//        for (String name : nameArray) {
//            System.out.println(name.length());
            // NullPointerException : name이 3개밖에 없는데 나머지 7개의 인덱스는 null값만 있기 때문
//        }
    }
}
