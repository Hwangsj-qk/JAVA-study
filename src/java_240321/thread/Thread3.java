package java_240321.thread;

public class Thread3 {
    // sleep 메서드 : 특정 시간 동안 스레드를 일시 정지
    // milli 초 1/1000 초
    // InterruptedException <- checked 예외 처리를 해야함
    public static void main(String[] args) {
        // 메인 스레드와 각각의 스레드는 실행 위치와 관계 없이 동시에 수행
        // 사용자 정의 스레드
        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("zzz...");
                // sleep은 오류 발생 가능성이 있기 때문에 예외 처리가 필요
            }
        });
        thread.start();

        // 메인 스레드
        try {
//            Thread.sleep(1000);     // 개운한 아침이 zzz... 두 번 나온 다음 실행됨 (순차적 실행 X)
            Thread.sleep(3000); // 개운한 아침이 zzz... 다 나온 다음에 실행됨 => 시간을 얼마나 주느냐에 따라 다름
            System.out.println("개운한 아침!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
