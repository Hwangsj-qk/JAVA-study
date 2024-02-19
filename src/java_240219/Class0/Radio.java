package java_240219.Class0;

public class Radio {


    // 필드: 라디오와 관련된 속성 데이터 음

    // 라디오와 관련된 데이터를 별도로 지정
    int volume;
    boolean isOn;

    // 메서드: 라디오와 관련된 기능, 행동의 모음

    // 라디오를 켜는 메소드
    void turnOn(){
        isOn = true;
        System.out.println("라디오 전원을 켰습니다. ");
    }
    // 음량 높이기
    void volumeUp() {
        volume+=2;
        System.out.println("라디오 음량: "  +  volume );
    }
    void volumeDown() {
        volume--;
        System.out.println("라디오 음량: " + volume);
    }
    void showRadioStatus() {
        System.out.println();
        System.out.println("라디오 상태 확인");
        if (isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량: " + volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }
     void trunOff() {
        isOn = false;
        System.out.println("라디오를 종료합니다. ");

    }




}
