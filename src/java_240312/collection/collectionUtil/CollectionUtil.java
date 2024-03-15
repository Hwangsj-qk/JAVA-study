package java_240312.collection.collectionUtil;

import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        // Collections 클래스: 다양한 컬렉션을 다루기 위해 제공하는 메서드들의 모음
         List<Integer> numberList = new ArrayList<>();
         numberList.addAll(
                 Arrays.asList(1,2,5,6,8,4,3,9,7)        // 이것도 유틸리티 클래스
         );
        System.out.println("numberList = " + numberList);       //  [1, 2, 5, 6, 8, 4, 3, 9, 7] => 입력 순서

        // sort : List를 정렬
        Collections.sort(numberList);
        System.out.println("numberList = " + numberList);       // [1, 2, 3, 4, 5, 6, 7, 8, 9]

//        Collections.sort(numberList, "비교자");        // 정렬 기준을 다르게 적용 가능

        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     // 반대로 정렬 - > 음수 / 양수를 완전히 바꿈(내림차순)      [9, 8, 7, 6, 5, 4, 3, 2, 1]
            }
        });
        System.out.println("numberList = " + numberList);

        // binarySearch : 이진 검색 알고리즘을 사용해서 정렬된 리스트를 검색 - 정렬이 되어 있어야 사용 가능
        Collections.sort(numberList);       // 정렬
        int index = Collections.binarySearch(numberList, 4);
        System.out.println("4의 인덱스: " + index);     // 3 (0번지부터 시작)

        // reverse(List) : 리스트 요소를 역순으로 뒤집는다.
        Collections.reverse(numberList);
        System.out.println("역순 numberList = " + numberList);        // [9, 8, 7, 6, 5, 4, 3, 2, 1]

        // suuffle(List) : 리스트 요소를 무작위로 섞는다.
        Collections.shuffle(numberList);
        System.out.println("섞은 numberList = " + numberList);        // [7, 4, 3, 2, 1, 6, 9, 5, 8]

        // fill(List) : 리스트의 '모든 요소'를 지정된 값으로 대체
//        Collections.fill(numberList, 0);
//        System.out.println("0으로 채운 numberList = " + numberList);   // [0, 0, 0, 0, 0, 0, 0, 0, 0]

        // copy(복사도착 List, 원본 List) : 리스트의 내용을 다른 리스트로 복사
        // 카피리스트의 크기(size)가 원본리스트(size)보다 같거나 커야 복사 가능
        List<Integer> copyNumberList = new ArrayList<>();
        copyNumberList.addAll(
                Arrays.asList(1,1,1,1,1,1,1,1,1)
        );
        Collections.copy(copyNumberList, numberList);
        System.out.println("copyNumberList = " + copyNumberList);

        // max, min : 최대값, 최소값 찾기
        numberList = Arrays.asList(2,6,3,3,6,8,2,1,9,4);
        System.out.println("numberList = " + numberList);
        Integer max = Collections.max(numberList);
        Integer min = Collections.min(numberList);
        System.out.println("max = " + max);     //max = 9
        System.out.println("min = " + min);     // min = 1

        // rotate(List, 거리(정수)) : 지정된 거리만큼 회전시킵니다.
        Collections.rotate(numberList, 3);
        System.out.println("3만큼 회전시킨 numberList = " + numberList);      // [1, 9, 4, 2, 6, 3, 3, 6, 8, 2]

        // replaceAll(list, 이전값, 새값)
        Collections.replaceAll(numberList,3, 30);
        System.out.println("numberList = " + numberList);       // [1, 9, 4, 2, 6, 30, 30, 6, 8, 2]

        //swap(List, 인덱스, 인덱스)
        Collections.swap(numberList,2,4);
        System.out.println("인덱스2와 4가 자리 바뀐 numberList = " + numberList);        //  [1, 9, 6, 2, 4, 30, 30, 6, 8, 2]

        //frequency(Collection, 객체) : 객체의 빈도수를 반환
        int frequency = Collections.frequency(numberList, 30);
        System.out.println("'30'의 빈도(frequency) = " + frequency);       // 2

        // disjoint(Collection, Collection) : 공통요소가 없으면 true 반환
        boolean disjoint = Collections.disjoint(numberList, Arrays.asList(40, 50, 60));     // true
        System.out.println("공통요소가 없는지 여부 disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(numberList, Arrays.asList(30, 50, 60));        // false
        System.out.println("공통요소가 없는지 여부 disjoint = " + disjoint2);





    }
}
