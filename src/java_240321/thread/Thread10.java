package java_240321.thread;

public class Thread10 {
    static int count = 0;

    // 동기화를 위한 자물쇠 객체
    static final Object lock = new Object();

    // 동기화 : Synchronized
    // 해당 블록에 대해 한 번에 하나의 스레드만 접근할 수 있도록 하여 경쟁상태를 예방할 수 있다.
    // (데이터 손실, 오류를 막을 수 있다)

    public static void main(String[] args) {
        Thread incrementer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // 동기화 블록 : 두 스레드가 한 번에 객체에 접근하는 것을 방지
                synchronized (lock) {
                    count++;
                }
            }
        });

        Thread decrementer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    count--;
                }
            }
        });

        incrementer.start();
        decrementer.start();

        try {
            Thread.sleep(200);
            System.out.println("count:" + count);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 동기화 이후에 count는 항상 0이 나옴

    }
}
