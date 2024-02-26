package java_240226.polymorphism;

public class Polymorphism2 {
    public static void main(String[] args) {
        // 업 캐스팅: 자식 클래스 타입에서 부모 클래스 타입으로 변환
        // 명시적으로 캐스팅 작성 필요가 없다.
        // 항상 안전함.
        SuperClass polymorph = new SubClass();

        // 다운 캐스팅: 부모 클래스에서 자식 클래스 타입으로 변환
        // 명시적으로 캐스팅을 작성해야 한다. => 강제 타입 변환
        // 위험 가능성: 런타임 오류인 ClassCastException을 발생시킬 수 있다.
        // 다운 캐스팅은 위험하므로 잘 사용하지 않는 것이 좋음
//        SubClass polymorph2 = new SuperClass();     컴파일 오류
        SubClass polymorph2 = (SubClass) new SuperClass();
        // 부모 클래스는 자식 클래스를 모름
        //polymorph2.subMethod();     // 컴파일러가 못 잡은 에러

    }
}
