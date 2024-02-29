package java_240228.nested.anonymous_interface.ex.ex5;

public class Anonymous {
    // 필드에서 익명객체 사용
    Worker field = new Worker() {
        @Override
        public void start() {
            System.out.println("디자인을 합니다. ");
        }
    };

    // 메서드에서 익명 객체 사용
    void method1() {
        Worker worker = new Worker() {

            @Override
            void start() {
                System.out.println("개발을 합니다. ");
            }
        };
        worker.start();
    }

    void method2(Worker worker) {
        worker.start();
    }


}
