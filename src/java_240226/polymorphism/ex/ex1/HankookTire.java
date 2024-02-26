package java_240226.polymorphism.ex.ex1;

public class HankookTire extends Tire {

    // 생성자
    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    // Tire의 roll 오버라이딩
    @Override
    public boolean roll() {
        accumulatedRotation++;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " 한국 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다. ");
            return true;
        } else {
            System.out.println(location + "한국 타이어를 교체하세요. ");
            return false;
        }
    }
}
