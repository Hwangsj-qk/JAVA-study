package java_240312.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;

public class Set4 {
    // LinkedHashSet
    // HashSet과 유사한 기능들을 모두 가짐. (중복 허용하지 않음)
    // 내부적으로 LinkedList를 사용하여 순서를 가질 수 있게 됨.
    // 중복을 불허하는 고유 요소를 유지하면서도 순서를 기억해야할 때 사용.
    // HashSet 보다 성능상 조금 느림 -> 순서를 보장하려면 List가 더 나을 수 있음
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("해시셋은");
        hashSet.add("순서를");
        hashSet.add("보장하지");
        hashSet.add("않습니다.");
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("hashSet = " + hashSet);
        // [null, 보장하지, 해시셋은, 않습니다., 순서를] (순서 X)

        linkedHashSet.add("해시셋은 ");
        linkedHashSet.add("순서를 ");
        linkedHashSet.add("보장하지 ");
        linkedHashSet.add("않습니다.");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add("순서를 ");

        System.out.println("linkedHashSet = " + linkedHashSet);
        // [해시셋은 , 순서를 , 보장하지 , 않습니다., null] (입력순서대로, 중복 X)

        // LinkedSet은 일반적은 Set과 달리 순서와 관련된 메서드가 존재한다.
        linkedHashSet.addFirst("첫번째 순서에 추가");
        linkedHashSet.addLast("마지막 순서에 추가");
        System.out.println("linkedHashSet = " + linkedHashSet);
        // [첫번째 순서에 추가, 해시셋은 , 순서를 , 보장하지 , 않습니다., null, 마지막 순서에 추가]
        linkedHashSet.removeFirst();
        System.out.println("linkedHashSet = " + linkedHashSet);
        // [해시셋은 , 순서를 , 보장하지 , 않습니다., null, 마지막 순서에 추가]

        // 첫번째 요소 가져오기
        String first = linkedHashSet.getFirst();
        System.out.println("first = " + first);     // 해시셋은

        // 순서를 뒤집은 셋 반환
        SequencedSet<String> reversed = linkedHashSet.reversed();
        // SequencedSet은 Set의 자식 클래스 -> SequenceSet을 Set으로 변경 가능
        System.out.println("reversed = " + reversed);
        // [마지막 순서에 추가, null, 않습니다., 보장하지 , 순서를 , 해시셋은 ]



    }
}
