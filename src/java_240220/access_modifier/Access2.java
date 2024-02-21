package java_240220.access_modifier;

public class Access2 {

    public static void main(String[] args) {
        Car car = new Car();    // new Car() : 힙 영역

        car.speedUp();
        car.speedDown();
        car.speedUp();

        car.setIsStop(false);
        // 시동이 꺼진 상태 => 0으로 출력

        // 현재 속도를 설정한다.
        car.setSpeed(110);
        car.speedDown();
        car.speedDown();

        // 현재 속도를 가져온다.
        car.getSpeed();
        System.out.println(car.getSpeed());
    }
}
