package java_240312.collection.map;

import java.util.*;

public class Map1 {
    // Key 와 Value 의 값으로 구성되는 Map.Entry 객체를 저장하는 구조
    // Entry: Map 인터페이스 내부에 선언된 중첩 인터페이스
    // Key: 중복 저장될 수 없으면 Value 는 중복 저장될 수 있음.
    // 기존 Key와 동일한 키로 저장하게 될 경우, 기존값은 없어지고, 새로운 값으로 대체됨
    /*
    구현 클래스
    HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
     */

    public static void main(String[] args) {
        // 제네릭으로 Key 의 타입, Value 타입 지정
        Map<String, Integer> map = new HashMap<>();

        // 새로운 Key, Value 쌍으로 추가
        map.put("사과", 1500);
        map.put("바나나", 3000);
        map.put("오렌지", 2000);

        // 전체 크기 확인하기
        int size = map.size();
        System.out.println(size);       // 3

        // get : Key 값으로 Value 을 반환(각각의 제네릭 타입에 따라 다르게 타입은 변한다)
        Integer banana = map.get("바나나");
        System.out.println(banana);     // 3000

        map.put("오렌지", 2500);       // 같은 Key 입력의 경우 마지막에 저장된 값으로 대체(set과의 차이점)
        System.out.println("오렌지 가격: "  + map.get("오렌지"));

        // 객체 순회
        Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // for - each(향상된 for문) : 객체의 내부 한 요소씩 순회하는 방법
        // 1. keySet 을 통해 순회
        for (String key : keySet) {
            System.out.println(key + " -> " + map.get(key));        // key -> value
            // map.get(key) => key 값에 따른 value 값 반환
        }

        // 2. values 순회
        for (Integer value : values) {
            System.out.println("가격: " + value);     // 가격만 나옴
        }

        // 3. Entry 순회
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue()); //오렌지 => 2500
            System.out.println(entry);  // 오렌지=2500 -> toString() 이 되어 있음
        }

        // 4. 반복자를 통한 순회
//        map.iterator()        // Map 에서는 반복자 사용 불가
        System.out.println("================");
        var iterator = map.entrySet().iterator();// set 으로 바꾸면 iterator 사용 가능
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> nextEntry = iterator.next();
            // nextEntry 는 map과 완전히 다른 요소 (nextEntry 를 출력하면 사과가 나옴)
            System.out.println(nextEntry.getKey() + " = " + nextEntry.getValue());
            // 바나나 = 300
            if(nextEntry.getValue() < 2000) {
                iterator.remove();      // 안전 제거(사이즈와 상관없이) -> nextEntry 에서 삭제한 것이 아니라 iterator에서 삭제
            }
            System.out.println(nextEntry.getKey() + " => " + nextEntry.getValue());
            // 여기서는 사과가 출력됨 (nextEntry에는 사과가 남아있기 때문)
        }
        System.out.println(entries);    // [오렌지=2500, 바나나=3000] => 사과 삭제
        // entries = map.entrySet()

        // 객체 삭제
        System.out.println("===== 바나나 삭제 =====");
        map.remove("바나나");      // key 값을 통해 삭제
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 객체 비우기 : 모든 요소 삭제
        map.clear();

        // 비어있는지 여부 확인
        boolean mapEmpty = map.isEmpty();
        System.out.println(mapEmpty);       //true



    }
}
