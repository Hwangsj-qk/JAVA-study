package java_240305.library.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) {
        // 날자와 시간을 원하는 형식으로 지정하기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM -dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("formatted = " + formatted);

        // 날짜와 시간 형식의 문자열을 DateTime 타입으로 변환(파싱)
        LocalTime parsedDateTime = LocalTime.parse(formatted, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);

        String str = "2024-3- 8";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-M- d");
        LocalDate parsedDt = LocalDate.parse(str, fmt);
        System.out.println("parsedDt = " + parsedDt);
        System.out.println(parsedDt.getMonth());
    }
}
