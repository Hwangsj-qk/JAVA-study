package java_240312.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    // 컬렉션 프레임워크의 주요 인터페이스 => java.util.Iterator (반복자)
    // java.lang.Iterable 인터페이스를 구현한 클래스에서 사용 (반복가능한)

    public static void main(String[] args) {
         ArrayList<Integer> numbers = new ArrayList<>(
                 List.of(1, 2, 3, 4)
         );

         // Iterable 을 구현한 컬렉션에서 반복자를 반환 값으로 가져옴.
        Iterator<Integer> iterator = numbers.iterator();        // 힙 영역 저장

        // next 메서드 : 다음 요소를 리턴 (다음으로 이동하면서)
        Integer i1 = iterator.next();
        System.out.println(i1);     // 1

        Integer i2 = iterator.next();
        System.out.println(i2);     // 2

        Integer i3 = iterator.next();
        System.out.println(i3);     // 3

        //hasNext 메서드 : 순회가 끝났는지 여부를 확인하고 리턴, 탐색할 요소가 없으면 false
        boolean b1 = iterator.hasNext();
        System.out.println(b1);     // true (3번까지였을 때)
        Integer i4 = iterator.next();       // 4까지 감
        boolean b2 = iterator.hasNext();
        System.out.println(b2);     // false(마지막까지 갔으므로 더이상 갈 next 가 없다)

//        Integer i5 = iterator.next();
//        System.out.println(i5);     // NoSuchElementException : 넘어갈 다음 요소가 없으므로 에러 발생

        // 반복자를 통한 요소 순회
        iterator = numbers.iterator();      // 반복 위치 초기화

        while(iterator.hasNext()) {     // hasNext() 가 true 일 때까지만 작동
            Integer i = iterator.next();    // 반드시 필요

            // 짝수면 제거
            if(i % 2 == 0) {
                // remove 메서드: 현 위치의 요소를 삭제
                // 호출 전에 반드시 next()를 호출해야 사용 가능
                // next() 호출 후 한번만 사용 가능
                // 반복자를 통해 안전한 제거 가능
                iterator.remove();
            }

        }
        System.out.println(numbers);

        /*
        Iterator의 중요성
        - 컬렉션 내부 요소들을 순회하고 '조작'하는 표준 방식
        - 코드의 안정성과 가독성을 높임.
        - 반복 중에 컬렉션이 구조적으로 추가가 되거나 삭제될 때 잠재적 문제를 빠르게 해결
        - remove()로 안전한 제거 가능

         */
    }
}
