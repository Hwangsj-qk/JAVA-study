package quiz_240322_5.q4;

import java.util.*;

public class Quiz4 {
    public static void main(String[] args) {
        List<String> bags = new ArrayList<>();
        bags.addAll(
                List.of("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );

        // 원본 물품 리스트
        System.out.println("원본 물품 리스트: " + bags);

        // 정렬 후 물품 리스트
        bags.sort(String::compareTo);
        System.out.println("정렬 후 물품 리스트: " + bags);

        // 뒤집은 후 물품 리스트
        bags.sort(Comparator.reverseOrder());
        System.out.println("뒤집은 후 물품 리스트: " + bags);

        // 셔플 후 물품 리스트
        Collections.shuffle(bags);
        System.out.println("셔플 후 물품 리스트: " + bags);

        // 물품 추가 후 리스트
        List<String> additems = new ArrayList<>(
                List.of("책", "휴대폰", "카메라")
        );
        bags.addAll(additems);
        System.out.println("물품 추가 후 리스트: " + bags);

        // 물품 추가 후 특정 물품 빈도수 찾기
        Iterator<String> iterator = bags.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("책")){
                count++;
            }
        }
        System.out.println("\"책\"의 빈도수: " + count);

        // 중복제거 후 리스트
        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(bags);
        System.out.println("중복 제거 후 리스트: " + stringSet);

        // 최소값
        Optional<String> min = bags.stream()
                .min(String::compareTo);

        System.out.println("가장 중요한 물품(최소값): " + min.get());


    }
}
