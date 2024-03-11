package java_240311.generic.generic_iterface;

public class Main {
    public static void main(String[] args) {
        // 제네릭을 지정하지 않은 경우 -> 잘 사용하지는 않음
        Rentable homeAgency = new HomeAgency();
        // Rentable 클래스 객체를 만들게 되면 Object로 반환됨 -> Home으로 캐스팅 필요
        Object rentHome = (Home) (homeAgency.rent());

        // 구현 클래스를 타입으로 지정한 경우
        HomeAgency newHomeAgency = new HomeAgency();
        Home rentHome2 = newHomeAgency.rent();

        // 제네릭으로 타입을 구체화한 경우
        Rentable<Car> carAgency = new CarAgency();
        Car rentCar = carAgency.rent();
    }
}
