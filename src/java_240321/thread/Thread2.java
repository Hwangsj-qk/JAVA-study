package java_240321.thread;

public class Thread2 {
    public static void main(String[] args) {
        // 스레드 생성
        // 스레드를 실행할 때는 반드시 run 이 아닌 start 사용

        // 1. Thread 상속 : 단일 상속만 허용하기 때문에 다른 클래스를 상속받을 경우 사용할 수 없음.
        MyThread2 myThread = new MyThread2();


        // 2-1. Runnable 구현 : 다른 클래스를 상속 받아도 스레드 생성 가능
        MyRunnable2 myRunnable = new MyRunnable2();
        Thread RunnableThread = new Thread(myRunnable);

        // 2-2. 매개변수에 익명 객체
        Thread threadAnonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("익명!");
                }
            }
        });


        // 2-3. 매개변수 Runnable 람다식
        Thread threadLambda = new Thread(
                () ->{
                    for (int i = 0; i < 30; i++) {
                        System.out.println("람다!");
                    }
                }
        );

        // run 메서드 직접 호출
        // 일반 메서드 호출과 마찬가지로 main 메서드에서 순차적으로 실행됨
//        myThread.run();
//        RunnableThread.run();
//        threadAnonymous.run();
//        threadLambda.run();

        // start 메서드 호출 => 순서가 계속적으로 바뀜
        // 새로운 스레드가 생성되고 별도의 실행흐름에서 run() 메서드를 실행
        // 동시성을 가지고 멀티 스레딩
        myThread.start();
        RunnableThread.start();
        threadAnonymous.start();
        threadLambda.start();

        // start 메서드는 각 스레드 인스턴스에 대해서 한번만 호출될 수 있음
        // 2번 호출할 경우
        // IllegalThreadStateException 발생
        myThread.start();

    }
}

// 1. 스레드 상속 받는 방법
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("상속!");
        }

    }
}

// 2. Runnable 인터페이스를 상속받는 방법
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("러너!");
        }
    }
}
