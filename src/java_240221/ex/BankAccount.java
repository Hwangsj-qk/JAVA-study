package java_240221.ex;

import java.util.Scanner;

public class BankAccount {
    private int accountId;
    private int balance;

    static int  count;

    BankAccount(int accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
        count ++;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금할 금액을 입력하세요: ");
        int add = scanner.nextInt();
        int total = balance += add;
        System.out.println("현재 잔액: " + total);
    }
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금할 금액을 입력하세요: ");
        int distract = scanner.nextInt();

        if (distract > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            int total2 = balance-= distract;
            System.out.println("현재 잔액: " + total2);
        }
    }
}
