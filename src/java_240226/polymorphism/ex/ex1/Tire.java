package java_240226.polymorphism.ex.ex1;

public class Tire {
    // 필드
    String location;     // 타이어의 위치
    int maxRotation;    // 타이어의 수명
    int accumulatedRotation;    // 회전할 때마다 누적 회전수 증가 => 최대 회전 수에 도달하면 타이어 펑크


    // 생성자
    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    // 메서드(roll)
    public boolean roll() {
        // 한 번 회전시 누적회전수 증가
        accumulatedRotation ++;
        // 누전회전수가 최대회전수를 초과했을 대 펑크, 아니면 정상수행
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다.");
            return true;
        } else {
            System.out.println(location + " 타이어를 교체하세요. ");
            return false;   // 펑크

            // roll 메서드가 true, false 반환
        }
    }


}
