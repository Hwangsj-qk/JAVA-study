package java_240220.com.bank.system;

public class Account {
    // 필드
    private int balance;

    // 메서드


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void getBalance() {
        int result1 = balance;
        System.out.println("잔액: " + result1 + "원 입니다. ");
    }
    public void deposit(double amount) {
        double result2 = balance += amount;
        System.out.println("잔액: " + result2 + "원 입니다. ");

    }
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다. ");
            return;
        } else{
            double result3 = balance -= amount;
            System.out.println("잔액: " + result3 + "원 입니다. ");
        }
    }
}
