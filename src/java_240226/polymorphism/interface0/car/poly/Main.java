package java_240226.polymorphism.interface0.car.poly;

import java_240220.access_modifier.first.A;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        // 역할(인터페이스) 타입 = 구체적인 객체

        Car avante = new Avante();
        driver.setCar(avante);
        driver.drive();

        Car sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

        // Open Close Principle
        // 차량이 추가될 경우 => 확장에는 열려있다.
        // 메인메서드의 실행문 이외의 코드는 변경할 필요가 없어진다.

        // sm5는 나중에 보고 다시 적기


    }

}
