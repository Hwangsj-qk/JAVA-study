package java_240222.inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        // 자식 객체를 생성하면, 상속관계 있는 부모가지 포함해서 인스턴스가 생성된다.
        // (2가지 클래스 정보가 공존, 메서드가 자기 타입에 없으면 부모 타입에 가서 찾는다.)
        // petroCar.move()를 호출하면 먼저 참조된 주소로 접근하여
        // 자식타입(자기 자신)을 찾아서 메서드가 존재하는지 찾고,
        // 없으면 부모 타입에서 찾아서 메서드를 호출한다.
        // 참조는 2단계 뿐만 아니라 여러 단계를 거쳐 할 수 있다.
        PetroCar petroCar = new PetroCar();
        petroCar.move();        // 부모 타입에 있는 메서드
        petroCar.fillUp();      // 자기 자신에 있는 메서드
        petroCar.pushBreak();   // 부모 타입에 있는 메서드
        // 상속은 같은 기능을 하는 메서드를 부모 타입에만 만들면 다 쓸 수 있다는 장점이 있다.

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.pushBreak();

        HydroCar hydroCar = new HydroCar();
        hydroCar.move();
        hydroCar.fillHydro();
        hydroCar.pushBreak();
    }
}
