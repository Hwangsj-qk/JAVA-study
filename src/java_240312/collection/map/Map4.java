package java_240312.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map4 {
    /*
    LinkedHashMap : 순서가 존재하는 HashMap
        - 순서를 유지해야 하는 로그 정보 등에 사용된다.
        - 삽입 순서를 기억해야할 필요가 있을 경우 유용하게 사용됨.
     */
    public static void main(String[] args) {
        // Map 인터페이스 추상화를 통해 필요한 자료구조로 변경
        // 성능: HashMap과 비슷한 성능을 갖지만, 순서 정보를 유지하는데 간접비용(Overhead)가 발생
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("해시맵은 ", 1);
        hashMap.put("순서를 ", 2);
        hashMap.put("보장하지 ", 3);
        hashMap.put("않아요", 4);

        linkedHashMap.put("링크드 해시맵은 " ,1);
        linkedHashMap.put("내부가 " ,2);
        linkedHashMap.put("링크드리스트라서 " ,3);
        linkedHashMap.put("순서가 보장되요. " ,4);

        for (String hashMapKey : hashMap.keySet()) {
            System.out.println(hashMapKey);
        }
        System.out.println("================");

        for (String s : linkedHashMap.keySet()) {
            System.out.println(s);
        }

        // LRU (Least Recently Used) Cache : 가장 최근에 접근한 순서에 따라 순서 요소 재배치(컴퓨터 최근에 사용한 파일? 생각하면 쉬움)
        // LinkedHashMap 생성자에서 accessOrder 를 true로 설정할 경우
        LinkedHashMap<Object, Object> lruCache =new LinkedHashMap<>(16, 0.75f, true);

        System.out.println("===========================");
        lruCache.put("이미지1", 1);
        lruCache.put("한글문서2", 2);
        lruCache.put("워드파일3", 3);
        lruCache.get("한글문서2");      // 최근에 사용한(조회만 해도) 접근요소가 마지막으로 옮겨짐
        lruCache.get("이미지1");
        lruCache.put("새로운파일1", 4);
        lruCache.get("이미지1");


        for (Map.Entry<Object, Object> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }


    }
}
