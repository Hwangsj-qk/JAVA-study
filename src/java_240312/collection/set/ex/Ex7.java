package java_240312.collection.set.ex;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Ex7 {
        /*
    연습문제: 회의실 예약 시스템 (확장)

    기존 온라인 회의실 예약 시스템에서 Comparator를 구현하여
    이름과 장소 기준으로 정렬하는 방법을 추가합니다.

    Comparator 구현:
    Reservation 객체들을 이름과 장소를 기준으로 정렬하는 Comparator 구현.

    새로운 TreeSet 생성:
    생성자에서 구현된 Comparator를 매개변수로 받는 TreeSet을 생성하고
    여러 Reservation 객체를 TreeSet에 추가합니다.
    이름과 장소 기준으로 정렬된 TreeSet의 요소들을 출력합니다.
     */
        static class Reservation {
            LocalDateTime start;
            String name;
            String place;

            public Reservation(LocalDateTime start, String name, String place) {
                this.start = start;
                this.name = name;
                this.place = place;
            }


            @Override
            public String toString() {
                return "예약 시간: " + start + ", " +
                        place + ", " + name;
            }
        }

    public static void main(String[] args) {
        Comparator<Reservation> nameComparator = new Comparator<Reservation>() {
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.name.compareTo(o2.name);
            }
            
        };

        Comparator<Reservation> placeComparator = new Comparator<Reservation>() {
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.place.compareTo(o2.place);
           }
        };

        TreeSet<Reservation> treeSet = new TreeSet<>(nameComparator);
        Reservation reservation1 = new Reservation(LocalDateTime.of(2023,10, 10, 12, 00),
                "김길동", "회의실A");
        Reservation reservation2 = new Reservation(LocalDateTime.of(2023,10, 10, 10, 00),
                "홍길동", "회의실B");
        Reservation reservation3 = new Reservation(LocalDateTime.of(2023,10, 11, 10, 00),
                "홍길동서", "회의실D");
        Reservation reservation4 = new Reservation(LocalDateTime.of(2023,10, 10, 15, 00),
                "홍길동남", "회의실C");

        treeSet.add(reservation1);
        treeSet.add(reservation2);
        treeSet.add(reservation3);
        treeSet.add(reservation4);

        for (Reservation reservation : treeSet) {
            System.out.println(reservation);
        }

    }
}
