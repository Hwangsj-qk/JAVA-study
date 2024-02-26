package java_240226.polymorphism.ex.ex1;

public class KumhoTire extends Tire {

    // 생성자
    public KumhoTire(int maxRotaton, String location) {
        super(maxRotaton, location);
    }

    // Tire의 roll 메서드 오버라이딩
    @Override
    public boolean roll() {
        accumulatedRotation ++;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다.");
            // 회전 여부 확인
            return true;
        } else {
            System.out.println(location + " 타이어를 교체하세요. ");
            return false;   // 펑크

            // roll 메서드가 true, false 반환
        }
    }
}
