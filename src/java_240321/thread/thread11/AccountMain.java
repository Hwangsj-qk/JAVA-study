package java_240321.thread.thread11;


import java_240321.thread.thread11.Account;

public class AccountMain {
    public static void main(String[] args) {
        // 하나의 계좌 지원에서 동시에 여러 스레드가 접근할 때
        // 경쟁 상태가 발생 (Synchronized -> 동기화 활용)
        // synchronized 메서드를 생성한 후 두 스레드가 한번에 객체에 접근하지 않음(경쟁 상태X)
        Account account = new Account(10000);

        Thread thread1 = new Thread(() -> {
            account.deposit(5000);
            account.withdraw(7000);
            account.withdraw(10000);
        }, "철수");

        Thread thread2 = new Thread(() -> {
            account.deposit(3000);
            account.withdraw(9000);
        }, "영희");

        thread1.start();
        thread2.start();
    }
}
