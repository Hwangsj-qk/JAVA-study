package java_240321.thread;

public class Thread12 {
    // 종료 플래그 : 메인 스레드에서는 변경, 새 스레드에는 참조
    // volatile 키워드: 모든 스레드가 해당 변수의 최신 업데이트된 값을 볼 수 있도록 해줌
    // (변경된 값이 가시적 visibility)
    static volatile boolean stop = false;

    public static void main(String[] args) {
        // 1초 동안 숫자를 1씩 증가시키면서 출력하고, 1초 뒤어 종료 플래그 발동

        // 새로운 스레드
        new Thread(() ->{
            int count =0;
            // stop(false) 을 참조하기 위해 cache(캐시)에 저장
            while (!stop) {
                count++;
                // 로그를 주석처리하고 실행할 경우 stop 플래그의 변경이 반영되지 않는다.
                // (예측 불가능 -> 일관성의 문제)
                // 업데이트된 false -> true 값을 보지 못하여서 탈출하지 못함 (대신 cache)를 봄
//                System.out.println(count);
//                -> 주석처리를 하게 되면 자동으로 반복문이 종료되지 않음 or 아니면 stop에 volatile를 적기
            }
            System.out.println("스레드가 종료되었습니다. ");
            // 메모리 배리어 역할(I/O) 출력을 하면서 stop 변수의 가시성을 강제 -> 로그가 필요한 이유
            // -> 신뢰할 수 있는 동기화 방법이 아님
        }).start();


        // 메인 스레드
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 1초 후 종료 플래그 (메인 스레드에서 변경)
        stop = true;
    }

    // 동기화하는 3가지 방법
    // 1. lock 사용
    // 2. synchronized 메소드 사용
    // 3. volatile 사용
}
