package java_240222.inheritance;

public class ElectricCar extends Car {
    ElectricCar() {
//        System.out.println("ElectricCar의 생성자 호출");
    }

    // 부모(superclass) 요소를 덮어쓸 때: @ override이라는 특별한 주석을 붙인다
    // 컴파일러가 메서드가 정확하게 오버라이딩 되었는지 확인을 한다.
    // overriding: 메서드 재정의, 필수는 아니지만 관습에 의한 준필수라고 할 수 있음(웬만하면 붙이는 게 좋다.)
    @Override       // 오버라이딩할 때는 부모 타입의 메서드 이름과 똑같아야 하는데 오타가 나면 문제가 발생 => 그것을 방지하기 위해서 @override 주석을 달게 됨.
    public void move() {
        System.out.println("조용하게 이동합니다. ");
    }

    public void charge() {
        System.out.println("전기차 배터리를 충전합니다. ");
    }


}
