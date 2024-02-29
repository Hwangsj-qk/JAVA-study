package java_240228.nested.anonymous_interface.ex.ex6;

public class Anonymous {
    // 필드에서 익명
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1(){
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        vehicle.run();
    }

    // 매개변수 익명객체
    void method2(Vehicle vehicle) {

        vehicle.run();
    }


}
