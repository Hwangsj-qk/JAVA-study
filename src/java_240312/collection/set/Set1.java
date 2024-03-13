package java_240312.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    // 컬렉션 프레임워크의 주요 인터페이스 중 하나
    /* ## Set의 특징
        1. 중복을 허용하지 않는다.
        2. 순서를 보장하지 않는다.
        (수학의 집합과 유사한 구조를 가짐)
       ## Set의 구현체의 종류
        1. HashSet : 가장 많이 사용된 set, 순서 보장 없고, 가장 뛰어난 성능.
        2. LinkedHashSet : 요소가 추가된 순서를 보장함 (예외)
        3. TreeSet : 요소가 자연 순서로 정렬되어 저장되는 구조
     */
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        System.out.println(numberSet);      // [1, 2, 3]

        numberSet.add(1);
        boolean addDuplicate = numberSet.add(2);
        System.out.println("addDuplicate = " + addDuplicate);       // false: 중복 값은 false 반환
        System.out.println(numberSet);      // [1, 2, 3] -> 중복 허용 x

        boolean addNewElement = numberSet.add(4);
        System.out.println("addNewElement = " + addNewElement);     // true : 새로운 요소는 true 반환
        System.out.println(numberSet);      // [1, 2, 3, 4] -> 중복이 아닌 요소는 추가 가능

        // 반환되는 boolean 을 통해 조건문 사용 가능
        if(! numberSet.add(3)) {
            System.out.println("3은 이미 존재하는 값입니다. ");
        }

        // contains : 포함 여부 반환
        if(numberSet.contains(2)) {
            System.out.println("Set에 2가 포함되어 있습니다. ");
        }

        // size : 데이터의 크기
        System.out.println(numberSet.size());       // 4

        for (int i = 0; i < numberSet.size(); i++) {
            // 인덱스를 기준으로 요소를 순회할 수 없음 (순서를 보장하지 않기 때문)
//            numberSet.get(i)      // 에러 발생 (인덱스가 없기 때문)
        }

        // Set은 순서를 보장하지 않기 때문에 인덱스와 관련된 메서드를 사용할 수 없음

        // 향상된 for문을 활용하면 요소 순회 가능 => 순서를 보장할 수 없음
        for (Integer i : numberSet) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 반복자를 사용한 요소 순회 (순서 보장 x)
        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // 요소를 입력하여 삭제
        boolean removeExist = numberSet.remove(3);
        boolean removeNone = numberSet.remove(5);
        System.out.println("removeExist = " + removeExist);     // true
        System.out.println("removeNone = " + removeNone);       // false => 존재하지 않는 것을 삭제하면 false 반환

        System.out.println(numberSet);      // [1, 2, 4]

        // 모든 요소 제거
        numberSet.clear();
        System.out.println(numberSet);      // []

        // 요소 한 번에 추가하기
        numberSet.addAll(Arrays.asList(5,6,7,8));
        System.out.println(numberSet);      // [5,6,7,8]

        // 배열로 반환하기 => 잘 사용하지 않음
        Object [] array =numberSet.toArray();


    }

}
