package java_240312.collection.map.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex1 {
    /*
        연습문제 1: 학생 점수 관리

    문제 설명
    학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요.
    프로그램은 다음 기능을 수행해야 합니다:

    학생의 이름과 점수를 추가합니다.
    특정 학생의 점수를 조회합니다.
    모든 학생의 이름과 점수를 출력합니다.

    예시 데이터
    학생 "Alice"의 점수는 85점입니다.
    학생 "Bob"의 점수는 92점입니다.
    학생 "Charlie"의 점수는 88점입니다.
     */

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        // 학생 이름과 점수 출력
        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 88);

        // 특정 학생의 점수 조회
        Integer scoreAlice = students.get("Alice");
        System.out.println(scoreAlice);
        Integer scoreBob = students.get("Bob");
        System.out.println(scoreBob);
        Integer scoreCharlie = students.get("Charlie");
        System.out.println(scoreCharlie);

        // 모든 학생의 이름과 점수 출력
        for (String key : students.keySet()) {
            System.out.println("학생 '" + key + "'의 점수는 " + students.get(key) + "점 입니다. ");
        }
    }
}
