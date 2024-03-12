package java_240312.collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    /*
        요소 제거
    문제: 문자열을 저장하는 ArrayList를 생성하고, 여러 개의 문자열을 추가하세요.
    그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요. 최종 리스트를 출력하는 프로그램을 작성하세요.

    > 예시 문자열
    "Hello", "World", "Java" "Programming"
    > 제거 후 리스트에 남은 요소
    "Programming"
     */
    public static void main(String[] args) {
        // 변수 선언
        List<String> stringList = new ArrayList<>();

        // 요소 한 번에 넣기
//        List<String> stringList = new ArrayList<>( List.of("Hello", "World", "Java", "Programming"));


        // 요소 추가
//        stringList.add("Hello");
//        stringList.add("World");
//        stringList.add("Java");
//        stringList.add("Programming");

        // 요소 한 번에 넣기
//        List<String> strings = List.of("Hello", "World", "Java", "Programming");      // 런타임 에러

/*
        // 역순으로 for문 접근
        for (int i = stringList.size(); i >=0;  i++) {
            stringList.remove(i);
        }

        // 제거할때마다 인덱스 조정
        for (int i = 0; i < stringList.size() -1; i++) {
            if(stringList.get(i).length() <= 5) {
                stringList.remove(i);
                i--;        // 요소를 제거할 때 인덱스 조정
            }
        }

        System.out.println(stringList);
        // 정답이 잘 나오지 않음 -> Iterator 활용

 */

        // 반복자를 사용하여 제거하는 방법 (표준)
        stringList.addAll(List.of("Hello", "World", "Java", "Programming"));

        Iterator<String> iterator = stringList.iterator();


        while(iterator.hasNext()) {
            String i = iterator.next();

            if(i.length() <= 5) {
                iterator.remove();
            }
        }
        System.out.println(stringList);
    }

}
