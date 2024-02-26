package java_240226.polymorphism.ex.ex1;

public class Car {
    // 필드(Composition 포함 관계)
    // Car has four Tire
    Tire frontLeftTire = new Tire(6, "앞왼쪽");
    Tire frontRightTire = new Tire(2, "앞오른쪽");
    Tire backLeftTire = new Tire(3, "뒤왼쪽");
    Tire backRightTire = new Tire(4, "뒤오른쪽");

    public int run() {
        // 자동차가 달릴 시, 타이어의 roll 메서드가 수행된다.
        System.out.println("차가 달립니다. ");
        if(frontLeftTire.roll() == false) {
            stop();
            return 1;   // 첫번째 포지션에 문제가 생겼기 때문에
        }
        if(frontRightTire.roll() == false) {
            stop();
            return 2;   // 두번째 포지션에 문제가 생김
        }
        if(backLeftTire.roll() == false) {
            stop();
            return 3;   // 세번째 포지션에 문제가 생김
        }
        if(backRightTire.roll() == false) {
            stop();
            return 4;   // 네번째 포지션에 문제가 생김
        }
        return 0;
    }

    // 타이어가 펑크가 나면 자동차가 멈춘다.
    void stop() {
        System.out.println("차를 멈추세요.");
    }
}
