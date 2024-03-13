package java_240312.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> sports = new HashSet<>();
        sports.add("축구");
        sports.add("야구");
        sports.add("아이스하키");
        System.out.println("sports = " + sports);       //[아이스하키, 야구, 축구] => 순서 보장 x

        Set<String> winterSports = new HashSet<>();
        winterSports.add("스키");
        winterSports.add("썰매");
        winterSports.add("아이스하키");
        System.out.println("winterSports = " + winterSports);       // [아이스하키, 스키, 썰매] => 순서 보장 x

        // 합집합
        Set<String> union = new HashSet<>(sports);
        union.addAll(winterSports);
        System.out.println("union = " + union);
        // [아이스하키, 야구, 스키, 썰매, 축구] => 합집합에서 중복된 요소는 한 번만 추가

        // 교집합
        Set<String> intersection = new HashSet<>(sports);
        intersection.retainAll(winterSports);
        System.out.println("intersection = " + intersection);     // [아이스하키]

        // 차집합: removeAll
        Set<String> difference = new HashSet<>(sports);
        difference.removeAll(winterSports);
        System.out.println("difference = " + difference);           // [야구, 축구]


    }
}
