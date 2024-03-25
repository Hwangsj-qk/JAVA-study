package java_240321.thread.ex;

import java_240305.library.lang.Object1;

public class Ex6 {
        /*
    연습문제: 음식점에서의 주문과 서빙

    문제 설명:
    당신은 음식점의 시스템을 관리하는 소프트웨어 엔지니어입니다. 음식점에는 고객과 요리사가 있으며,
    고객은 주문을 하고 요리사는 해당 주문을 받아 음식을 준비한 후 서빙합니다. 고객은 주문을 한 번에 하나씩만 할 수 있으며,
    요리사는 한 번에 하나의 주문만 처리할 수 있습니다. 주문이 들어오면, 요리사는 주문을 받아 음식을 준비하기 시작하고,
    준비가 완료되면 음식을 서빙합니다. 이 과정을 wait()와 notify()를 사용하여 동기화하도록 시스템을 구현해야 합니다.

    요구사항:
    - Restaurant 클래스를 구현하여 고객의 주문과 요리사의 음식 준비 과정을 시뮬레이션합니다.
    - 고객의 주문(placeOrder())과 요리사의 음식 준비(prepareOrder()) 메서드는 동기화 메서드로 구현합니다.
    - 주문이 들어오면 요리사는 주문을 받아 음식을 준비합니다. 음식 준비가 완료되면 고객에게 서빙됩니다.
    - 주문이 처리되는 동안 다른 주문은 대기해야 하며, 요리사는 한 번에 하나의 주문만 처리할 수 있습니다.
    (주문 처리 시간은 2초입니다.)
    - 주문 처리 과정(고객의 주문, 요리사의 음식 준비, 음식 서빙)은 콘솔에 메시지를 출력하여 표시합니다.


    출력예시
    ===
    고객: 주문을 합니다.
    요리사: 주문을 받아 음식을 준비합니다.
    (2초 후)
    요리사: 음식 준비 완료, 서빙합니다.
    고객: 주문을 합니다
    ...(무한 반복)
     */

    static class Restaurant {
        boolean isOrdered = false;


            synchronized void placeOrder () {
                while (!isOrdered) {
                    System.out.println("고객: 주문을 합니다.");
                    isOrdered = true;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

            synchronized void prepareOrder () {
                System.out.println("요리사: 주문을 받아 음식을 준비합니다.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("음식 준비 완료, 서빙을 합니다. ");
                isOrdered = false;
                notifyAll();
            }


    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

    }
}
