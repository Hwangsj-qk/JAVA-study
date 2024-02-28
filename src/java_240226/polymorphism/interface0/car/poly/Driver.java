package java_240226.polymorphism.interface0.car.poly;

// 운전자 Avante를 소유하고, 운전할 수 있다.
public class Driver {
    // 필드
    // 구체적인 것에 의존하는 대신 추상적인 것(인터페이스, 역할)에 의존한다.
    private Car car;
    // 차량이 추가 되어도 코드가 변결되지 않는다.
//    private Sonata sonata;

    // 메서드

    // 자동차 설정
    public void setCar(Car car) {
        this.car = car;
    }

    // 운전
    public void drive() {
        // 구체적인 것 대신 추상적인 것에 의존 => DIP
        // 차량이 추가될 대마다 코드가 변경되지 않는다. => OCP

        car.onEngine();
        car.pressAccel();
        car.pressBreak();
        car.offEngine();
    }
}
