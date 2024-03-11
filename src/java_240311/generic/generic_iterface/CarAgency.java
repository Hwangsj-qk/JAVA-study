package java_240311.generic.generic_iterface;

// 자동차만 전문적으로 대여하는 자동차 대리점
public class CarAgency implements Rentable<Car> {   // 여기서 Car는 파라미타 타입
    @Override
    public Car rent() {
        // 리턴 타입도 구체화된 클래스로 변경
        System.out.println("새 자동차를 대여합니다. ");
        return new Car();
    }
}
