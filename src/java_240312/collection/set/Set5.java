package java_240312.collection.set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set5 {
    // TreeSet
    // 자동으로 정렬되는, 중복을 불허하는 자료구조
    // Red-Black Tree 알고리즘을 기반으로 사용
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(36);
        treeSet.add(7);     // 중복 불허
//        treeSet.add(null);  // 에러 발생: null은 비교할 수 있는 대상이 아니므로 제외 (Runtime Exception)

        System.out.println("treeSet = " + treeSet);
        // [5, 7, 10, 20, 36] => Red -Black Tree 형태로 정렬

        // 첫번째 / 마지막 요소 가져오기
        Integer first = treeSet.first();
        System.out.println("first = " + first); // 5 (가장 왼쪽)
        Integer last = treeSet.last();
        System.out.println("last = " + last);   // 36

        // 10보다 head(왼쪽, 작은) 숫자들의 집합을 반환 (요소 포함)
        SortedSet<Integer> headSet = treeSet.headSet(10);
        System.out.println("headSet = " + headSet);     // [5, 7]

        // 10보다 tail(오른쪽, 큰) 숫자들의 집합을 반환 (요소 포함)
        SortedSet<Integer> tailSet = treeSet.tailSet(10);
        System.out.println("tailSet = " + tailSet);     //  [10, 20, 36] => 10도 포함

        // 해당 요소 바로 아래 요소 리턴
        Integer lower = treeSet.lower(10);
        System.out.println("lower = " + lower);     // lower = 7

        // 해당 요소 바로 위 요소 리턴
        Integer higher = treeSet.higher(10);
        System.out.println("higher = " + higher);   // higher = 20

        TreeSet <String> stringTreeSet = new TreeSet<>();

        stringTreeSet.addAll(
                Arrays.asList("Banana", "Coke", "Apple", "Zebra", "Fruit")
        );

        System.out.println("stringTreeSet = " + stringTreeSet);
        // [Apple, Banana, Coke, Fruit, Zebra] (abc순)

        stringTreeSet.addAll(
                Arrays.asList("가", "다", "나", "하", "자")

        );
        System.out.println("stringTreeSet = " + stringTreeSet);
        // [Apple, Banana, Coke, Fruit, Zebra, 가, 나, 다, 자, 하] (abc -> 가나다순)


    }

}
