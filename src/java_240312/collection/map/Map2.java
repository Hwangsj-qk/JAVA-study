package java_240312.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, Integer> bookPageMap = new HashMap<>();

        bookPageMap.put("위대한 개츠비", 180);
        // putIfAbsent : 키가 존재하지 않을 경우만 값을 추가 -> 존재할 경우 변화 X
        bookPageMap.putIfAbsent("위대한 개츠비", 200);
        bookPageMap.putIfAbsent("1984", 328);
        System.out.println(bookPageMap);        // {1984=328, 위대한 개츠비=180}

        // foreach : 모든 key - value에 대해 실행문을 실행 (반복문)
        bookPageMap.forEach((key, value) ->
                System.out.println(key + "는 " + value + "쪽"));      // 위대한 개츠비는 180쪽

        // replace : 키의 값(value) 을 대체
        bookPageMap.replace("위대한 개츠비", 180, 300);
        System.out.println(bookPageMap);        // 위대한 개츠비 = 300
        System.out.println("대체된 페이지 수: "+ bookPageMap.get("위대한 개츠비"));

        // getOrDefault() : 키가 존재하지 않을 때 디폴트(기본) 값 반환
        Integer unkownPageOfBook = bookPageMap.getOrDefault("홍길동전", 250);
        System.out.println("unkownPageOfBook = " + unkownPageOfBook);

        // of(key, value, key, value,...) => 수정불가 Map 반환
        Map<String, Integer> unmodifiableMap = Map.of(
                "전우치전", 400, "홍길동전", 500, "허생전", 600);

        // putAll : 다른 맵을 한꺼번에 추가
        bookPageMap.putAll(unmodifiableMap);
        // [1984=328, 허생전=600, 전우치전=400, 홍길동전=500, 위대한 개츠비=300]

        // 한 요소씩 출력
        for (Map.Entry<String, Integer> entry : bookPageMap.entrySet()) {
            System.out.println(entry);
        }

        // 한꺼번에 출력
        System.out.println(bookPageMap.entrySet());

        // containsKey : 키 포함 여부
        boolean b1 = bookPageMap.containsKey("허생전");

        // containsValue : 값 포함 여부
        boolean b2 = bookPageMap.containsValue(500);

        // 잘못된 키를 넣으면 null 을 반환
        Integer noneValue = bookPageMap.get("없는 책");
        System.out.println("noneValue = " + noneValue);     // noneValue = null

        // null 을 key 값으로 value 저장 가능 (중복 불가, 추천하지 않음)
        bookPageMap.put(null, 100);
        bookPageMap.put(null, 200);
        System.out.println("null = " + bookPageMap.get(null));      // 200

        // value 는 null 로 중복 저장 가능
        bookPageMap.put("좋은 책", null);
        bookPageMap.put("반간예정책", null);
        System.out.println("bookPageMap = " + bookPageMap);
        // {null=200, 1984=328, 허생전=600, 전우치전=400, 홍길동전=500, 반간예정책=null, 위대한 개츠비=300, 좋은 책=null}






    }

}
