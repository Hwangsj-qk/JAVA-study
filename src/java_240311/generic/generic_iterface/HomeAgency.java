package java_240311.generic.generic_iterface;

// 집을 대여해주는 대리점 클래스
public class HomeAgency implements Rentable <Home>{
    // 타입 파라미터 T -> Home 으로 대체 가능
    @Override
    public Home rent() {
        // 리턴 타입도 구체화된 클래스로 변경
        return new Home();
    }
}
