package java_240321.thread.thread11;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // 입금
    // synchronized 메서드 : 메서드 전체를 동기화
    // 메서드가 포함하는 모든 코드에 대해서 한 번에 하나의 스레드만 접근 가능
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + "가 입금했습니다. 입금액: " + amount +
                ", 잔액: " + balance);
    }
    // ※ synchronized의 경우 메서드나 블록 두 군데 모두 사용 가능

    // 출금
    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "가 출금했습니다. 출금액: " + amount +
                    ", 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다(출금 불가)" + "출금액: " + amount +
                    ", 잔액: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}
