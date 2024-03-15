package java_240312.collection.collectionUtil;

import java.util.*;

public class LifoFifo {
    public static void main(String[] args) {
        // LIFO: 후입선출(Last In First Out) -> Stack
        // FIFO: 선입선출(First In First Out) -> Queue

        /*
        1. Stack
            - 마지막에 추가된 요소가 먼저 제거됨
              - push : 스택에 마지막 요소를 추가
              - pop : 스택에서 마지막 요소를 꺼냄(제거 + 반환)
              - peek : 스택에서 마지막 요소를 반환

              ex) 택시에 동전케이스, 웹 브라우저 방문 기록, 함수 호출에 콜스택, DFS(깊이우선탐색)

              java에서 Stack 클래스는 컬렉션 프레임워크와 일관성이 떨어지는 문제로 사용하지 않습니다
              => 모던 자바에서는 ArrayDeque를 사용
         */
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack = " + stack);     //  [10, 20, 30]

        // 가장 마지막에 있는 것부터 '삭제'하면서 반환
        Integer popNumber = stack.pop();
        System.out.println("popNumber = " + popNumber);     // 30

        System.out.println("stack = " + stack);     // [10, 20]

        // peek : 가장 마지막 요소 확인(반환)하고 제거하지 않음
        Integer peekNumber = stack.peek();
        System.out.println("peekNumber = " + peekNumber);       // 20

        System.out.println("stack = " + stack);     // [10, 20]


        /*
        2. Queue(대기열)
            - 가장 먼저 추가된 요소가 가장 먼저 제거
                - offer: 큐의 끝에 요소를 추가
                - poll : 큐의 시작부분 요소를 제거하고 반환
                - peek : 큐의 시작부분 요소를 확이낳고 제거하지 않음

                ex) 인쇄 작업 대기열, 웹 서버의 요청 처리 대기, BFS(너비 우선 탐색)
                Queue 인터페이스 구현 객체 : LinkedList, ArrayDeque
         */

        Queue<String> queue = new LinkedList();

        // 요소 추가
        queue.offer("1번 손님");
        queue.offer("2번 손님");
        queue.offer("3번 손님");

        System.out.println("queue = " + queue);     // [1번 손님, 2번 손님, 3번 손님]

        // poll : 가장 앞 요소를 반환하고 삭제
        String poll = queue.poll();
        System.out.println("poll = " + poll);       // 1번 손님

        System.out.println("queue = " + queue);     // [2번 손님, 3번 손님]

        // peek : 가장 앞 요소를 반환하고 삭제하지는 않음
        String peekGuest = queue.peek();
        System.out.println("peek = " + peekGuest);       // 2번 손님

        System.out.println("queue = " + queue);     // [2번 손님, 3번 손님]

        /*
        Deque(데크) : Double Ended Queue
        큐 자료 구조에서 양 쪽 끝 요소를 추가하거나 제거할 수 있는 유연한 자료 구조
        FIFO 와 LIFO 방식을 모두 지원

        Deque 인터페이스 구현 객체 : LinkedList, ArrayDeque
         */

        Deque<Integer> deque = new ArrayDeque<>(
                Arrays.asList(3,4,5)
        );
        System.out.println("deque = " + deque);     // [3, 4, 5]

        // 앞 쪽에 요소 추가
        deque.addFirst(2);
        deque.offerFirst(1);

        System.out.println("deque = " + deque);     // [1, 2, 3, 4, 5]

        // 뒤 족에 요소 추가
        deque.addLast(6);
        deque.offerLast(7);

        System.out.println("deque = " + deque);     // [1, 2, 3, 4, 5, 6, 7]

        // ※ addLast-offerLast, addFirst - offerFirst 역할을 똑같음

        // 앞 쪽에서 요소 제거 (FIFO)
        deque.removeFirst();
        deque.pollFirst();

        System.out.println("deque = " + deque);     // [3, 4, 5, 6, 7]

        // 뒤 쪽에서 요소 제거(LIFO)
        deque.removeLast();     // 가장 뒤 쪽 요소 제거 (7 제거)
        deque.pollLast();       // 뒤 쪽 요소 제거    (6 제거)
        deque.pop();        // 가장 마지막에 '들어온 요소' 제거 (남은 3,4,5 중 하나 제거)   // 근데 많이 헷갈림

        System.out.println("deque = " + deque);     // [4, 5]


    }
}
