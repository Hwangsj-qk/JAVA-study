package java_240321.thread.ex;

public class Ex2 {
    public Ex2() {
        super();
    }

    /*
    연습문제: 여행 준비

    문제 설명:
    세 명의 친구가 함께 여행을 가기로 했습니다. 각자의 짐을 싸는 데에는 다른 시간이 소요되며,
     모두 짐을 싸야만 여행을 출발할 수 있습니다. 친구 A는 2초, 친구 B는 3초, 친구 C는 5초가 걸립니다.
     각 친구가 짐을 다 싸면 "A의 짐 준비 완료!", "B의 짐 준비 완료!", "C의 짐 준비 완료!"와 같이 출력되어야 하며,
     모든 준비가 끝나면 "모두 준비 완료, 여행을 출발합니다!"라고 출력합니다.

    요구사항:
    - 각 친구를 대표하는 스레드 3개를 만듭니다(FriendA, FriendB, FriendC).
    - 각 스레드는 친구가 짐을 싸는 데 걸리는 시간(대기 시간)을 시뮬레이션합니다.
    - 메인 스레드는 모든 친구의 준비가 완료될 때까지 기다렸다가 여행 출발 메시지를 출력해야 합니다.


    출력예시
    A의 짐 준비 완료!
    B의 짐 준비 완료!
    C의 짐 준비 완료!
    모두 준비 완료, 여행을 출발합니다!

     */
    public static void main(String[] args) {
        Thread friendA = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A의 짐 준비 완료!");
        });


        Thread friendB = new Thread(() ->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("B의 짐 준비 완료!");
        });

        Thread friendC = new Thread(() ->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("C의 짐 준비 완료!");
        });

        friendA.start();
        friendB.start();
        friendC.start();

        // 세 스레드가 모두 종할 때까지 메인 스레드는 대기하고 있음
        try {
            // 한 번에 여러 개의 조인 사용 가능
            friendA.join();
            friendB.join();
            friendC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("모두 준비 완료! 여행을 출발합니다!");

        // Runnable 인터페이스를 상속 받은 클래스를 생성하여 문제를 해결할 수도 있음


    }
}
