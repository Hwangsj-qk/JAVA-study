package java_240319.stream.ex;

import java.util.*;

public class Ex9 {
    /*
 연습 문제 1: 도서관 책 대여 기록 분석
도서관의 책 대여 기록이 있습니다. 각 대여 기록에는 사용자 ID와 대여한 책의 수량이 포함되어 있습니다.
여러분의 목표는 다음 정보를 계산하는 것입니다:

전체 대여된 책의 수량을 계산하세요.
대여 기록이 가장 많은 사용자의 ID를 찾으세요.

record BookRental(String userId, int quantity) {}

List<BookRental> rentals = Arrays.asList(
 new BookRental("user1", 3),
 new BookRental("user2", 5),
 new BookRental("user3", 1),
 new BookRental("user4", 2)
);

출력예시
===
전체 대여된 책의 수량: 11
가장 많은 책을 대여한 사용자: user2
  */
    public static void main(String[] args) {
        List<BookRental> rentals = Arrays.asList(
                new BookRental("user1", 3),
                new BookRental("user2", 5),
                new BookRental("user3", 1),
                new BookRental("user4", 2)
        );

        int sum = rentals.stream()
                .mapToInt(BookRental::quantity)     // 수량 정수 -> 스트림으로 변환
                .sum();
        System.out.println("전체 대여된 책의 수량: " + sum);

        Optional<BookRental> max = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity));
        System.out.println("가장 많은 책을 대여한 사용자: " + max.get().userId);
        // 현재 max는 Optional 타입이므로 Bookrental에 저장된 것을 불러오기 위해선 get()이 필요

        // 2번째 조건 다른 방법
        String topUserID = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity))
                .map(bookRental -> bookRental.userId)
                .orElse("찾지 못했습니다. ");


    }
    record BookRental(String userId, int quantity) {}
}
