package java_240305.library.lang;

import java.text.MessageFormat;
import java.util.Calendar;

public class StringFormat {
    public static void main(String[] args) {
        // 문자열 포매팅하기
        String name = "홍길동";
        int age = 30;
        // 1. printf(): 포맷 형태로 출력
        // 형식지정자를 문자열 % 기호를 사용하여 삽입할 위치와 방식 지정
        System.out.printf("이름: %s, 나이: %d\n", name, age);

        // 2. String.format() : 포맷팅 된 문자열로 반환 (출력 X) -> 하위버전에서 실무 사용!
        String.format("이름: %s, 나이: %d\n", name, age);

        // 3. MessageFormat.format: 복잡한 포매팅이 필요할 때 (출력 X) -> 순서를 변경할 때 편리
        MessageFormat.format("이름: {0}, 나이: {1}", name, age);

        // 4. "문자열".formatted("포맷") : 포맷된 문자열을 반환 -> 자바 13 버전에서 추가됨 (출력 X)
        "이름: %s, 나이: %d\n".formatted(name, age);

        // 문자열 포매팅 예시

        // 숫자 또는 금액 포매팅(%, 천 단위로 콤마 형식, %n 부동소수점 자리수)
        double dollarPrice = 1234.56;
        String fmt1 = String.format("가격: %,.2f 달러", dollarPrice);
        System.out.println(fmt1);

        // 날짜 시간 포매팅
        Calendar now = Calendar.getInstance();
//        String fmt2 = String.format("현재 날짜: %tY년 %tm월 %td일", now);  // now는 많은 정보를 담고 있기 때문에 이대로만 넣으면 에러

        // %tY, %tm, %td : 연 월 일 형식지정장
        // $1, $2, $3: 첫번째, 두번째, 세번째 인자를 사용하겠다는 의미 (인자 순서가 맞으면 사용할 필요가 없음)
        String fmt2 = String.format("현재 날짜: %1$tY년 %1$tm월 %1$td일", now);
        System.out.println(fmt2);

        // 패딩 간격과 정렬하기
        // %숫자s : 숫자 만큼의 자리를 차지 (기본 우측 정렬)
        // % -숫자s : 숫자만큼 자리를 차지 (좌측 정렬)
        String fmt3 = String.format("이름: [[%10s]]", name);
        System.out.println(fmt3);

        // 대문자 변환하기
        // %S : 영문자 대문자 변환
        String hello = "Hello Java";
        String fmt4 = String.format("인사말: %S", hello);
        System.out.println(fmt4);

        // 자료형에 따른 형식지정자
        // %s : 문자열, %d: 정수, %f: 실수(실수 소수점 기본 6자리, .뒤에 숫자 넣어서 고정 소수자리 지정 -> 타입에 맞춰서 넣지 않으면 에러 발생
        int year = 2024;
        double temp = 12.3;
        String fmt5 = String.format("연도: %d, 온도: %.1f 도", year, temp);
        System.out.println(fmt5);


    }
}
