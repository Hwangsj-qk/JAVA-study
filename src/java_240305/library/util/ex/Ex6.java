package java_240305.library.util.ex;

import java.time.*;

public class Ex6 {
    /*
    연습 문제 3: 회의 시간대 변환하기
    요구사항: 뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
     이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
    ZonedDateTime과 ZoneId를 사용하여 시간대 변환을 수행하세요.

    출력예시:
    회의는 뉴욕 기준 오후 3시에 시작합니다.
    서울에서는 회의가 오전 5시에 시작합니다.
    런던에서는 회의가 오후 8시에 시작합니다.
     */
    public static void main(String[] args) {
//        "America/NewYork", "Europe/London","Asia/Seoul";
        LocalDateTime localTime = LocalDateTime.of(2024,3,8,15,0,0);

        System.out.println("회의는 뉴욕 기준으로 오후 3시에 시작합니다.");

        // 날짜 형식에 패턴 문자를 맞춘다. a(PM/AM) h(시간)

        


    }
}
