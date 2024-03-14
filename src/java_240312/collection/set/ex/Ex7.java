package java_240312.collection.set.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        Comparator<Reservation> comparator = new Comparator<Reservation>() {
            @Override
            public int compare(Reservation o1, Reservation o2) {
                int nameCompared = o1.name.compareTo(o2.name);

                if (nameCompared == 0) {
                    int placeCompared = o1.place.compareTo(o2.place);
                    return placeCompared;
                }
                return nameCompared;
            }
            
        };
        // 여러가지 정렬 기준을 가지고 있다면 if 문 사용하기


        // 만약 사용자에게 스캐너를 통해 예약 시간을 받을 때는 포매터를 설정해줘야 함.
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 시작");
        // 포매터의 경우 형식을 정확하게 맞추지 않으면 에러 발생 (주의하기)
//        LocalDateTime.parse("2023-10-10 12:00");    // 이러한 형태는 굳이 포매터를 해주지 않아도 컴퓨터가 이해함.
//        LocalDateTime.parse("2023년 10월 10일 12시 00분 시작", dateTimeFormatter);     // 만약 바로 파싱을 할거면 포매터 뒤에 입력

        TreeSet<Reservation> treeSet = new TreeSet<>(comparator);
        Reservation reservation1 = new Reservation(LocalDateTime.of(2023,10, 10, 12, 00),
                "김길동", "회의실A");
        Reservation reservation2 = new Reservation(LocalDateTime.of(2023,10, 10, 10, 00),
                "홍길동", "회의실B");
        Reservation reservation3 = new Reservation(LocalDateTime.of(2023,10, 11, 10, 00),
                "홍길동서", "회의실D");
        Reservation reservation4 = new Reservation(LocalDateTime.of(2023,10, 10, 15, 00),
                "홍길동남", "회의실C");
        // 데이터 포매터를 사용하면 코딩 길이를 조금 줄일 수 있음.

        treeSet.add(reservation1);
        treeSet.add(reservation2);
        treeSet.add(reservation3);
        treeSet.add(reservation4);

        for (Reservation reservation : treeSet) {
            System.out.println(reservation);
        }

    }
}
