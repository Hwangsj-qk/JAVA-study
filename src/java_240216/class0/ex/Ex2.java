package java_240216.class0.ex;

public class Ex2 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.brand = "a사";
        car1.model = "모델1";
        car1.year = 2020;

        Car car2;
        car2 = new Car();
        car2.brand = "b사";
        car2.model = "모델2";
        car2.year = 2018;

        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        for (int i = 0; i < cars.length; i++) {
            System.out.println("[자동차 브랜드: " + cars[i].brand + " / 자동차 모델: " + cars[i].model +
                    " / 자동차 생산년도: " + cars[i].year + "]");


        }


    }
}
