package java_240222.inheritance;

public class Inheritance2 {
    public static void main(String[] args) {
        // 자기 자신에게 있는 메서드는 자동완성에서 조금 더 진한 색으로 표시됨
        PetroCar car = new PetroCar();
        car.move();

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();     // 오버라이딩: 덮어쓰기


    }
}
