package java_240312.collection.collectionUtil.ex;

import java.util.*;

public class Ex1 {
    /*
    연습 문제: 여행 가방 준비하기

요구사항
가방에 넣을 물품 리스트 생성: 여러분이 여행 가방에 넣고자 하는 물품들로 리스트를 생성하세요.
물품 정렬: 리스트에 있는 물품들을 알파벳 순으로 정렬하세요.
물품 순서 뒤집기: 한 번은 순서대로 정렬된 물품 리스트의 순서를 뒤집어 보세요.
물품 셔플: 준비한 물품 리스트의 순서를 무작위로 섞어 보세요.
특정 물품의 빈도 수 계산: 리스트 내에 특정 물품이 몇 개 있는지 계산하세요.
물품 추가: 여행 가방에 추가 물품을 넣으세요. 이미 리스트가 있다면, addAll 메소드를 사용하여
추가 물품 리스트를 기존 리스트에 합쳐 보세요.
중복 물품 제거: 여행 가방에서 중복된 물품을 제거한 새로운 리스트를 생성하세요. (힌트: Set 컬렉션 사용)
가장 중요한 물품 찾기: 여행에서 가장 중요한 물품(문자열에서 가장 앞서거나 뒤에 오는)을 찾아 보세요.

출력예시
===
원본 물품 리스트: [지갑, 여권, 선글라스, 책, 삼각대, 충전기, 지도, 겨울옷]
정렬 후 물품 리스트: [겨울옷, 선글라스, 여권, 지갑, 지도, 삼각대, 충전기, 책]
뒤집은 후 물품 리스트: [책, 충전기, 삼각대, 지도, 지갑, 여권, 선글라스, 겨울옷]
셔플 후 물품 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권]
'여권'의 빈도 수: 1
추가 물품 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라]
중복 제거 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라]
가장 중요한 물품(최소값): 겨울옷
     */
    public static void main(String[] args) {
        List<String> bagsList = new ArrayList<>();
        bagsList.addAll(
                Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );
        System.out.println("원본 물품 리스트: " + bagsList);
        System.out.println();

        // 정렬
        Collections.sort(bagsList);
        System.out.println("정렬 후 물품 리스트: " + bagsList);
        System.out.println();

        // 정렬 뒤집기
        Collections.sort(bagsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("뒤집은 후 물품 리스트: " + bagsList);
        System.out.println();

        // 셔플
        Collections.shuffle(bagsList);
        System.out.print("셔플 후 물품 리스트" + bagsList);
        System.out.println();

        // 물품 추가하기
//        bagsList.addAll(
//                Arrays.asList("책", "휴대폰", "카메라")
//        );
        Collections.addAll(bagsList, "휴대폰", "카메라", "책"); // -> Collections에도 addAll 존재
        System.out.println("\n추가 물품 후 리스트: " + bagsList);
        // 책의 빈도수 찾기
        int frequency1 = Collections.frequency(bagsList, "책");
        System.out.println("'책'의 빈도수: " + frequency1);
        System.out.println();

        // 중복 제거
//        for (int i = bagsList.size()-1; i >= 0 ; i--) {
//            String list = bagsList.get(i);
//            if(Collections.frequency(bagsList,list) > 1) {
//                bagsList.remove(list);
//            }
//        }
//        System.out.println("중복 제거 후 리스트:" + bagsList);
        // 삭제하면 size가 달라져서 오류 발생

        Set<String> uniqueItem = new HashSet<>(bagsList);
        // Set은 중복값을 허용하지 않음 -> 성질 잘 파악해서 활용하기
        System.out.println("중복제거 후 리스트(set 형태 그대로 받기): " + uniqueItem);
        System.out.println();

        bagsList = new ArrayList<>(uniqueItem);
        System.out.println("중복 제거 후 리스트(list 형태로 받기): " + bagsList);
        System.out.println();

        // 최소값
        String min = Collections.min(bagsList);
        System.out.println("가장 중요한 물품(최소값) :" + min);
        System.out.println();


    }
}
