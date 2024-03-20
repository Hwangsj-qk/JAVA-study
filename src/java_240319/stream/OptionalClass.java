package java_240319.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalClass {
    public static void main(String[] args) {
        // Optional 클래스
        // Java 8부터 도입, 값이 있거나, 없을 수 있는 컨데이너 객체
        // NPE 을 방지함. 메서드가 결과를 반환할 수 없을 때 null 대신 사용
        // 집계값이 존재하지 않을 경우 디폴트 값을 설정하거나 람다식을 등록할 수 있음
        List<Integer> list = new ArrayList<>();
        //list.addAll(List.of(1,2,3,4,5));

//         평균을 가져오는 데 NoSuchElementException가 발생
//        double asDouble = list.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("=================================");

        // 1. isPresent : Optional 이 값을 포함하는 여부를 확인
        boolean present = optional.isPresent();
        System.out.println("present = " + present);

        if(present) {
            System.out.println("평균값: " + optional.getAsDouble());
        }else {
            System.out.println("평균값: 0");
        }

        // 2. orElse : 값이 없을 경우(null) 기본값을 정해놓음
        // 존재하면 값 반환, 존재하지 않으면 other(디폴트값) 반환
        double avg = optional.orElse(0);
        System.out.println("orElse 사용 방법 / 평균: " + avg);
        // 값이 없으면 0(기본값)을 반환, 값이 있으면, 값을 계산해서 반환

        // 3. ifPresent : 값이 있을 경우만 동작하는 람다식
        optional.ifPresent(n -> System.out.println("ifPresent / 평균: " + n));
        // 값이 없을 때 실행하면 아무것도 반환하지 않음 (orElse와의 차이점)

        // 3-1. ifPresentOrElse
        // 값이 없을 경우 Runnable 람다식
        optional.ifPresentOrElse(n -> System.out.println("평균: " + n),
                () -> System.out.println("평균: 요소가 없습니다. "));

        // 4. orElseThrow : 값이 존재하지 않을 경우 예외 발생시키기
//        double avg2 = optional.orElseThrow();
        double avg3 = optional.orElseThrow(() -> new IllegalArgumentException("배열에 아무 요소가 없습니다."));
        // 사용자 정의 예외를 만들 수 있음
    }
}
