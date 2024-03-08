package java_240305.library.util.ex;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex4 {
    /*    연습 문제 1: 다가오는 생일까지 남은 날짜 계산하기
    요구사항:
    사용자로부터 생년월일을 입력받아, 올해의 생일이 지났는지 여부에 따라
     올해 또는 내년 생일까지 남은 날짜를 계산하여 출력하세요.
     사용자의 생년월일과 현재 날짜에 LocalDate를 사용하고,
     남은 날짜 계산에는 Period 클래스를 활용하세요.

    입력 예시:
    1990-05-24

    출력 예시 (올해 생일이 지났을 경우):
    다음 생일까지 240일 남았습니다!

    출력 예시 (올해 생일이 아직 안 지났을 경우):
    다음 생일까지 30일 남았습니다!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일을 입력해주세요: ");

        // 생일을 입력 받아 날짜 데이터로 전환
        String birthDay = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedBirthDay = LocalDate.parse(birthDay, formatter);
        // 일반적인 날짜 포맷일 경우, 포맷 없이도 문자열 파싱 가능
        LocalDate finalBirthDay = parsedBirthDay.withYear(2024);

        // 현재 날짜 데이터
        LocalDate now = LocalDate.now();

        // 남은 생일 구하기
        if (now.isBefore(finalBirthDay)) {
            Period between1 = Period.between(now, finalBirthDay);
            int between1Final = between1.getMonths() * 30 + between1.getDays();
            System.out.printf("다음 생일까지 %s일 남았습니다. ", between1Final );
        } else {
            Period between2 = Period.between(finalBirthDay, now);
            int between2Final = between2.getMonths() * 30 + between2.getDays()+365;
            System.out.printf("다음 생일까지 %s일 남았습니다. ", between2Final);

        }






    }
}
