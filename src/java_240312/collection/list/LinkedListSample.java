package java_240312.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
    /*
    ArrayList vs LinkedList
    ArrayList: 인덱스를 통한 빠른 접근이 필요한 상황
     - 조회가 많고, 추가나 삭제가 적은 경우 유리하게 사용
     LinkedList: 데이터의 추가 및 삭제가 빈번하게 발생하는 경우 사용
      - 특히, 대용량 데이터의 삽입, 삭제가 이루어지는 경우 유리하게 사용
     */
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 시간 측정: ArrayList
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("arrayList 소요시간: " + (endTime = startTime));
        // 소요시간이 매우 김.

        // 시간 측정: linkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();


        System.out.println("linkedList 소요시간: " + (endTime = startTime));
        // 매우 빠름




    }
}
