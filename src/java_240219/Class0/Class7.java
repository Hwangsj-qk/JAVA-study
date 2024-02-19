package java_240219.Class0;

public class Class7 {
    public static void main(String[] args) {

        // 라디오와 연관된 데이터를 라디오 객체로 묶음
        // 관련 데이터를 쉽게 구분 가능
        Radio radio = new Radio();      // 라디오(별도의 객체) 생성

        // 재사용이 가능한 기능들을 메소드로 추출하기
        // 라디오 켜기
        turnOn(radio);      // 메소드 활용(리팩토링)

        // 음량 높이기
        volumeUp(radio);        // 메소드 활용(리팩토링)
        volumeUp(radio);
        // 음량 줄이기
        volumeDown(radio);      // 메소드 활용 (리팩토링)
        // 라디오 상태 확인
        showRadioStatus(radio);     // 메소드 활용 (리팩토링)
        // 라디오 끄기
        trunOff(radio);     //메소드 활용 (리팩토링)

        // **모듈화**
        // 코드 중복이 제거
        // 같은 로직이 필요하면 메서드를 호출하면 됨
        // 기능이 수정될 때, 메서드 내부만 변경하면 된다 -> 수정이 용이함

    }
    // 라디오를 켜는 메소드
    static void turnOn(Radio radio){
        radio.isOn = true;
        System.out.println("라디오 전원을 켰습니다. ");
    }
    // 음량 높이기
    static void volumeUp(Radio radio) {
        radio.volume+=2;
        System.out.println("라디오 음량: "  + radio.volume );
    }
    static void volumeDown(Radio radio) {
        radio.volume--;
        System.out.println("라디오 음량: " + radio.volume);
    }
    static void showRadioStatus(Radio radio) {
        System.out.println("라디오 상태 확인");
        if (radio.isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량: " + radio.volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }
    static void trunOff(Radio radio) {
        radio.isOn = false;
        System.out.println("라디오를 종료합니다. ");

    }

}
