package java_240305.library.util;

import java.time.*;
import java.util.Set;

public class TimeClass {
    public static void main(String[] args) {
        // 자바 8버전 이후부터 기존 날짜 시간 클래스들의 단점을해결한 LocalDateTime 클래스를 사용
        // java.time 패키지에 소속되고, 불변(immutable) 객체를 사용 (더 안정적)

        // 시간대 정보를 포함하지 않는 클래스
        // 날짜와 시간 모두 표현
        LocalDateTime localDateTime = LocalDateTime.now();
        // 날짜만 표현
        LocalDate localDate = LocalDate.now();
        // 시간만 표현
        LocalTime localTime = LocalTime.now();
        // 시간대 정보를 포함하는 클래스
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);     // 날짜 정보만 출력 (today = 2024-03-08)

        // 특정 날짜 설정
        LocalDate specificDate = LocalDate.of(2025, 1, 1);
        System.out.println("specificDate = " + specificDate);   // 입력한 특정 날짜만 출력(specificDate = 2025-01-01)

        // 개별 가져오기
        int year = today.getYear();
        int monthValue = today.getMonthValue();
        int dayOfMonth = today.getDayOfMonth();

        // 날짜 더하기
        LocalDate nextWeek = today.plusWeeks(1);    // 1주 후 날짜 계산
        System.out.println("nextWeek = " + nextWeek);

        // 날짜 빼기
        LocalDate priviousMonth = today.minusMonths(5);     // 5달 전 날짜 계산
        System.out.println("priviousMonth = " + priviousMonth);

        // 현재 시간 가져오기
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        LocalTime specificTime = LocalTime.of(16, 30, 00);
        System.out.println("specificTime = " + specificTime);
        
        // 시간 더하기
        LocalTime after100Minutes = now.plusMinutes(100);
        System.out.println("after100Minutes = " + after100Minutes);

        // 현재 날짜와 시간
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        // 특정 날짜 시간 (연월일시분초 입력가능)
        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println("specificDateTime = " + specificDateTime);

        // 날짜 시간 더하기
        LocalDateTime after100Days = nowDateTime.plusDays(100).plusHours(3);
        System.out.println("after100Days = " + after100Days);

        // 특정 시간대 현재날짜 시간 가져오기
        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("nowInNewYork = " + nowInNewYork);
        // ※ 원하는 timeZone의 경우 검색해서 찾을 수 있음

        // 시간대 ID 전체 가져오기
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        // 한국 시간대 가져오기
        ZonedDateTime nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("nowSeoul = " + nowSeoul);

    }
}
